package water.api;

import water.MRTask;
import water.api.schemas3.SetSystemPropertyV3;
import water.rapids.Rapids;
import water.rapids.Val;


public class SetSystemPropertyHandler extends Handler {
  

  @SuppressWarnings("unused") // called via reflection
  public SetSystemPropertyV3 setSystemProperty(int version, SetSystemPropertyV3 request) throws Exception {
    Val val = Rapids.exec("(setproperty '" + request.property + "' '" + request.value + "')");
    new MRTask() {
      @Override
      protected void setupLocal() {
        if (!(String.valueOf(request.value)).equals(System.getProperty(request.property))) {
          throw new IllegalStateException("System property was not set");
        }
      }
    }.doAllNodes();
    return request;
  }
  
}
