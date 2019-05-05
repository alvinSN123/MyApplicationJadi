package com.example.myapplication;



//alvin satria nugraha
// 10116064

// tanggal 27 - 1 menentukan disign
//tanggal 29 - 2 membuat navigation bar menu
//tanggal 3 mei 2019 membuat Walkthrougt
// tanggal 4 mei 2019 membuat reycle view
// tanggal 5 mei 2019 membuat isi menu
public class ScreenItem {

    String Title,Desciption;
    int ScreenImg;

    public ScreenItem(String title, String desciption, int screenImg) {
        Title = title;
        Desciption = desciption;
        ScreenImg = screenImg;

    }

    public void setTitle (String title) {
            Title = title;
    }

    public void setDesciption(String desciption) {
        Desciption = desciption;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }

    public String getTitle() {
        return Title;

    }
    public String getDesciption() {
        return Desciption;

    }
    public int getScreenImg() {
        return ScreenImg;

    }







}
