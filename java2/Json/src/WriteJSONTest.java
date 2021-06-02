import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteJSONTest {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {

        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("FirstName", "Dang");
        employeeDetails.put("LastName", "Kim Thi");
        employeeDetails.put("Website", "codelean.vn");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);

        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("FirstName", "Code");
        employeeDetails2.put("LastName", "Lean");
        employeeDetails2.put("Website", "codelean.com");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employeeDetails2);

        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);

        try (FileWriter file = new FileWriter("employees.json")) {
             file.write(employeeList.toJSONString());
             file.flush();
        }catch (IIOException e) {
            e.printStackTrace();
        }
    }
}
