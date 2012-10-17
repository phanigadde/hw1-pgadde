/**
 * @author phani
 * 
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.examples.SourceDocumentInformation;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.DocumentAnnotation;
import org.apache.uima.resource.ResourceConfigurationException;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.FileUtils;
import org.apache.uima.util.Progress;
import org.apache.uima.util.ProgressImpl;

/**
 * A simple collection reader that reads documents from a directory in the filesystem. It can be
 * configured with the following parameters:
 * <ul>
 * <li><code>InputDirectory</code> - path to directory containing files</li>
 * <li><code>Encoding</code> (optional) - character encoding of the input files</li>
 * <li><code>Language</code> (optional) - language of the input documents</li>
 * </ul>
 * 
 * 
 */
public class FileSystemCollectionReader extends CollectionReader_ImplBase {
  /**
   * Name of configuration parameter that must be set to the path of a directory containing input
   * files.
   */
  public static final String PARAM_INPUTFILE = "InputFile";

  private BufferedReader reader;

  private int fileSize;

  private int currentIndex;

  /**
   * @see org.apache.uima.collection.CollectionReader_ImplBase#initialize() Iterates over the
   *      document text first to know the number of sentences. That count is used in hasNext(). 
   *      The file pointer is then reset to the file beginning
   */
  public void initialize() throws ResourceInitializationException {
    try {
      reader = new BufferedReader(new FileReader(
              ((String) getConfigParameterValue(PARAM_INPUTFILE)).trim()));
      String line = reader.readLine();
      fileSize = 0;
      while (line != null) {
        fileSize += 1;
        line = reader.readLine();
      }
      reader = new BufferedReader(new FileReader(
              ((String) getConfigParameterValue(PARAM_INPUTFILE)).trim()));
      currentIndex = 0;
      // System.out.println("Hehe fileSize:"+fileSize);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  /**
   * @see org.apache.uima.collection.CollectionReader#hasNext()
   */
  public boolean hasNext() {
    // System.out.println("hehe in hasNext "+currentIndex+" "+fileSize+" "+(currentIndex <
    // fileSize));
    return currentIndex < fileSize;
  }

  /**
   * @see org.apache.uima.collection.CollectionReader#getNext(org.apache.uima.cas.CAS)
   */
  public void getNext(CAS aCAS) throws IOException, CollectionException {
    JCas jcas;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new CollectionException(e);
    }

    // open input stream to file
    String text = reader.readLine();
    // put document in CAS
    jcas.setDocumentText(text);
    currentIndex += 1; //Incrementing the index;
  }

  /**
   * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#close()
   */
  public void close() throws IOException {
  }

  /**
   * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#getProgress()
   */
  public Progress[] getProgress() {
    return new Progress[] { new ProgressImpl(currentIndex, fileSize, Progress.ENTITIES) };
  }

  /**
   * Gets the total number of documents that will be returned by this collection reader. This is not
   * part of the general collection reader interface.
   * 
   * @return the number of documents in the collection
   */
  public int getNumberOfDocuments() {
    return fileSize;
  }

}
