// Konversi API Post Date ke dalam fotmat tanggal-bilan-tahun
// Reza Gunawan

package com.mine.suakaonline.helper;

public class DateConverter {

    public String getDate(String unformatedDate ){
        return unformatedDate.substring(8,10);
    }

    public String getMonth(String unformatedDate)
    {
        String month = unformatedDate.substring(5,7);
        switch (month) {
            case "01":
                month = "Januari";
                break;
            case "02":
                month = "Februari";
                break;
            case "03":
                month = "Maret";
                break;
            case "04":
                month = "April";
                break;
            case "05":
                month = "Mei";
                break;
            case "06":
                month = "Juni";
                break;
            case "07":
                month = "Juli";
                break;
            case "08":
                month = "Agustus";
                break;
            case "09":
                month = "September";
                break;
            case "10":
                month = "Oktober";
                break;
            case "11":
                month = "November";
                break;
            case "12":
                month = "Desember";
                break;
        }
        return month;
    }

    public String getYear(String unformatedDate)
    {
        return unformatedDate.substring(0,4);
    }
}
