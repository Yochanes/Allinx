package androidx.core.app;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class ShareCompat {

    /* JADX INFO: compiled from: Proguard */
    public static class IntentBuilder {

        /* JADX INFO: renamed from: a */
        public final Intent f23107a;

        /* JADX INFO: renamed from: b */
        public String f23108b;

        /* JADX INFO: renamed from: c */
        public ArrayList f23109c;

        public IntentBuilder(FragmentActivity fragmentActivity) {
            Activity activity;
            fragmentActivity.getClass();
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f23107a = action;
            action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", fragmentActivity.getPackageName());
            action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", fragmentActivity.getPackageName());
            action.addFlags(524288);
            Context baseContext = fragmentActivity;
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (baseContext instanceof Activity) {
                        activity = (Activity) baseContext;
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f23107a.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
                this.f23107a.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class IntentReader {
    }

    /* JADX INFO: renamed from: a */
    public static void m7478a(Intent intent, ArrayList arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), null, (Uri) arrayList.get(0)));
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            clipData.addItem(new ClipData.Item((Uri) arrayList.get(i)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }
}
