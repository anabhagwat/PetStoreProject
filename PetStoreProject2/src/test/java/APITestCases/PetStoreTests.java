package APITestCases;

import org.testng.annotations.Test;
import io.restassured.RestAssured.given;

import java.util.HashMap;

public class PetStoreTests {
    @Test(priority=0)
    public void test_OrderPet()
    {
        HashMap mapdata = new HashMap();
            mapdata.put("id", 100);
            mapdata.put("petId", 1);
            mapdata.put("quantity", 1);
            mapdata.put("shipdate", "2024-05-15T11:59:38.395Z");
            mapdata.put("status", "placed");
            mapdata.put("complete", "true");

            given()
                .contentType("application/json")
                .body(mapdata)
            .when()
                .post(https://petstore.swagger.io/v2/store/order)
            .then()
                .statusCode(200)
                .log().body();

        }

        @Test(priority=0)
        public void test_NewPet()
        {
            HashMap data = new HashMap();
            {
                data.put("id", 100);
                data.put("category", "string" );
                data.put("name", "doggie");
                data.put("status", "available");
                data.put("photoUrls", "string");

                given()
                        .contentType("application/json")
                        .body(data)
                        .when()
                        .post(https://petstore.swagger.io/v2/pet)
            .then()
                    .statusCode(200)
                    .log().body();

            }

    }
}
