import java.io.IOException;

import org.apache.uima.cas.CAS;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.util.Progress;

/**
 * 
 */

/**
 * @author pgadde
 *
 */
public class CollectionReader extends CollectionReader_ImplBase {

  /**
   * 
   */
  public CollectionReader() {
    // TODO Auto-generated constructor stub
  }

  /* (non-Javadoc)
   * @see org.apache.uima.collection.CollectionReader#getNext(org.apache.uima.cas.CAS)
   */
  @Override
  public void getNext(CAS aCAS) throws IOException, CollectionException {
    // TODO Auto-generated method stub

  }

  /* (non-Javadoc)
   * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#hasNext()
   */
  @Override
  public boolean hasNext() throws IOException, CollectionException {
    // TODO Auto-generated method stub
    return false;
  }

  /* (non-Javadoc)
   * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#getProgress()
   */
  @Override
  public Progress[] getProgress() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see org.apache.uima.collection.base_cpm.BaseCollectionReader#close()
   */
  @Override
  public void close() throws IOException {
    // TODO Auto-generated method stub

  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
