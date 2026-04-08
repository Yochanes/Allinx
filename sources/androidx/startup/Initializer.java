package androidx.startup;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface Initializer<T> {
    Object create(Context context);

    List dependencies();
}
