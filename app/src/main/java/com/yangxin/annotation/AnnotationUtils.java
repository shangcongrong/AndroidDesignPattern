package com.yangxin.annotation;

import android.app.Activity;
import android.util.Log;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by xinyang on 2017/9/21.
 */

public class AnnotationUtils {

    public static void injectViews(Activity activity) {
        Class<? extends Activity> object = activity.getClass();
        Field[] fields = object.getDeclaredFields();
        for (Field field : fields) {
            MyAnnotation myAnnotation = field.getAnnotation(MyAnnotation.class);
            if (myAnnotation != null) {
                int viewId = myAnnotation.value();
                Log.d("viewId", "viewId:" + viewId);
                if (viewId != -1) {
                    try {
                        Method method = object.getMethod("findViewById", int.class);
                        Object resView = method.invoke(activity, viewId);
                        field.setAccessible(true);
                        field.set(activity, resView);
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
