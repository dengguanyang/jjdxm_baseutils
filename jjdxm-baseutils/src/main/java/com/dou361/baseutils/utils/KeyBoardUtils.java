package com.dou361.baseutils.utils;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * ========================================
 * <p/>
 * 版 权：深圳市晶网科技控股有限公司 版权所有 （C） 2015
 * <p/>
 * 作 者：陈冠明
 * <p/>
 * 个人网站：http://www.dou361.com
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2015/12/27
 * <p/>
 * 描 述：打开或者关闭软键盘
 * <p/>
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class KeyBoardUtils {

    private KeyBoardUtils() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * 隐藏键盘
     */
    public static void hideKeyboard(View view) {
        InputMethodManager imm = (InputMethodManager) UtilsManager.getInstance().getAppContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /**
     * 显示键盘
     */
    public static void showKeyboard(View view) {
        InputMethodManager imm = (InputMethodManager) UtilsManager.getInstance().getAppContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(view, InputMethodManager.SHOW_FORCED);
    }
}
