package com.google.common.escape;

import androidx.media3.extractor.mp4.C1962a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.errorprone.annotations.DoNotMock;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@DoNotMock("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class Escaper {
    private final Function<String, String> asFunction = new C1962a(this, 1);

    public final Function<String, String> asFunction() {
        return this.asFunction;
    }

    public abstract String escape(String str);
}
