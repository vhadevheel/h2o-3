package water.api.schemas3;

import water.Iced;
import water.api.API;

public class SetSystemPropertyV3 extends RequestSchemaV3<Iced, SetSystemPropertyV3>  {

  //Input fields
  @API(help = "Input data frame", direction=API.Direction.INPUT)
  public String property = "";

  @API(help = "Factor columns", direction=API.Direction.INPUT)
  public boolean value = true;
}

