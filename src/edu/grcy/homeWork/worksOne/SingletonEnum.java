package edu.grcy.homeWork.worksOne;

import java.util.ArrayList;
import java.util.List;

public enum SingletonEnum {
    INSTANCE;

   private List<String> listServesEnum;

    public List<String> getListServesEnum() {
        return listServesEnum  = new ArrayList<>();
    }

    public boolean isAddedSerwerToListServer(String nameServer) {
        int sizeListServer = listServesEnum.size();
        if (nameServer.startsWith("http") || nameServer.startsWith("https")) {
            if (!listServesEnum.contains(nameServer)) {
                listServesEnum.add(nameServer);
            }
        }
        if (listServesEnum.size() == ++sizeListServer) {
            return true;
        } else {
            return false;
        }
    }
}
