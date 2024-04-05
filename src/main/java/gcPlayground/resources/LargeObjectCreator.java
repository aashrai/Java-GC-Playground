package gcPlayground.resources;

import gcPlayground.utils.LargeObject;
import gcPlayground.utils.RandomStringGenerator;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@Path("/create-object")
@Produces(MediaType.APPLICATION_JSON)
public class LargeObjectCreator {

    Map<String, LargeObject> largeObjectMap;
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(10);

    public LargeObjectCreator() {
        largeObjectMap = new HashMap<>();
    }

    @POST
    @Path("{sizeInMb}")
    public String createObjects(@PathParam("sizeInMb") double sizeInMb) {
        LargeObject largeObject = new LargeObject((int) (sizeInMb * Math.pow(10, 6)));
        String key = RandomStringGenerator.generateRandomString(10);
        largeObjectMap.put(key, largeObject);
        return key;
    }

    @POST
    @Path("simulate")
    public void simulateObjectCreation() throws InterruptedException {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 150; j++) {
                Thread.sleep(30);
                createObjects(0.5);
            }
            largeObjectMap.clear();
        }
    }

    @PUT
    @Path("clear-objects")
    public void clearLargeObjects() {
        largeObjectMap.clear();
    }
}