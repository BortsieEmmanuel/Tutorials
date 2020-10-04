package Basics;

import javafx.collections.FXCollections;

public class ObservableList {
    public static void main(String[] args){
        javafx.collections.ObservableList oblist = FXCollections.observableArrayList();
        oblist.addAll("ama","Adjoa", "Esi","Aksoua", 9,3.7,'a',8);
        System.out.println(oblist);
    }
}
