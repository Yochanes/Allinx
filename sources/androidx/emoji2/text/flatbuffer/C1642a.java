package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8Old;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1642a implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        int i = Utf8Old.f24377b;
        Utf8Old.Cache cache = new Utf8Old.Cache();
        Charset charset = StandardCharsets.UTF_8;
        charset.newEncoder();
        charset.newDecoder();
        return cache;
    }
}
