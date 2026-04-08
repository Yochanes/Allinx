package androidx.media3.common.text;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class CueGroup {

    /* JADX INFO: renamed from: b */
    public static final CueGroup f25553b = new CueGroup(ImmutableList.m14824of());

    /* JADX INFO: renamed from: a */
    public final ImmutableList f25554a;

    static {
        Util.m9594D(0);
        Util.m9594D(1);
    }

    public CueGroup(List list) {
        this.f25554a = ImmutableList.copyOf((Collection) list);
    }
}
