public class RoomCoder {
   
   public static String buildingID(String name) {
      if (name.equals(null) || name.length() == 0) {
         return "";
      }
      if (name.length() > 4) {
         return name.substring(0,4).toUpperCase();
      }
      return name.toUpperCase();
      
   }
   public static String areaID(String name) {
      if (name.equals(null) || name.length() == 0) {
         return "";
      }
      String ret = name.substring(0,1).toUpperCase();
      return ret;
   }
   public static String numberID(String number, String area, boolean areaFirst) {
      if (areaFirst) {
         return area.substring(0,1) + number;
      }
      return number + area.substring(0,1).toUpperCase();
      
   }   
   public static String code(String[] info, boolean areaFirst) {

      if (info[2] == "") {
         return buildingID(info[0]) + info[1];
      }
      return buildingID(info[0]).toUpperCase() + numberID (info[1], info[2], areaFirst).toUpperCase();
   }
}