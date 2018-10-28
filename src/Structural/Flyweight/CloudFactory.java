package Structural.Flyweight;

import java.util.HashMap;

public class CloudFactory {
    private HashMap<TypeCloud, Cloud> cloudHashMap;

    public CloudFactory() {
        this.cloudHashMap = new HashMap<TypeCloud, Cloud>();
    }

    public Cloud getCloud(TypeCloud typeCloud) {
        Cloud cloud = (Cloud) this.cloudHashMap.get(typeCloud);

        if (cloud == null) {
            cloud = new Cloud(typeCloud, "x.png", 0, 0);
            this.cloudHashMap.put(typeCloud, cloud);
        }
        return cloud;
    }

    public int countCloudMap() {
        return this.cloudHashMap.size();
    }
}
