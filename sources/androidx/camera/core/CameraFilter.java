package androidx.camera.core;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Identifier;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface CameraFilter {

    /* JADX INFO: renamed from: a */
    public static final Identifier f2204a = Identifier.m1489a(new Object());

    /* JADX INFO: renamed from: a */
    default Identifier mo1215a() {
        return f2204a;
    }

    /* JADX INFO: renamed from: b */
    List mo1216b(List list);
}
