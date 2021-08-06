package com.saksham.customloadingdialog;

import android.content.Context;

public class Loader {
    static CustomLoader customLoader;

    public static void showDialog(Context context, boolean cancellable, int animation){
        hideDialog();
        if(context != null){
            try {
                customLoader = new CustomLoader(context, animation);
                customLoader.setCanceledOnTouchOutside(true);
                customLoader.setCancelable(cancellable);
                customLoader.show();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void hideDialog(){
        if(customLoader!=null && customLoader.isShowing()){
            try{
                customLoader.dismiss();
                customLoader = null;
            }catch (Exception e){
                customLoader = null;
            }
        }
    }
}
