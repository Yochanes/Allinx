package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements Initializer<Result> {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Handler28Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Result {
    }

    @Override // androidx.startup.Initializer
    public final Object create(Context context) {
        Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC2109a(this, context.getApplicationContext()));
        return new Result();
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
