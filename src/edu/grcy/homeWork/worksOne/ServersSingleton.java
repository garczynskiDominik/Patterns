package edu.grcy.homeWork.worksOne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServersSingleton {
    private static final ServersSingleton INSTANCE = new ServersSingleton();
    private final List<String> SERVERSLIST;

    private ServersSingleton() {
        SERVERSLIST = new ArrayList<>();
    }
    public static ServersSingleton getINSTANCE(){
        return INSTANCE;
    }

    /**
     * Lazy double checked singleton
     */
//    public synchronized ServersSingleton getInstance() {
//        if (INSTANCE == null){
//            INSTANCE =  new ServersSingleton();
//        }
//        return INSTANCE;
//    }


    public boolean isAddedSerwerToListServer(String nameServer) {
        int sizeListServer = SERVERSLIST.size();
        if (nameServer.startsWith("http") || nameServer.startsWith("https")) {
            if (!SERVERSLIST.contains(nameServer)) {
                SERVERSLIST.add(nameServer);
            }
        }
        if (SERVERSLIST.size() == ++sizeListServer) {
            return true;
        } else {
            return false;
        }
    }

    public List<String> getListServersStartWithLetters(String startWithLetters) {
        return SERVERSLIST.stream()
                .filter(x -> x.startsWith(startWithLetters))
                .collect(Collectors.toUnmodifiableList());


    }

}
