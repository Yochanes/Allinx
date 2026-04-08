package androidx.core.os;

import android.content.Context;
import android.os.UserManager;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class UserManagerCompat {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api24Impl {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7659a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
