package androidx.datastore.preferences.core;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m18302d2 = {"<anonymous>", "Ljava/io/File;"}, m18303k = 3, m18304mv = {1, 5, 1}, m18306xi = 48)
final class PreferenceDataStoreFactory$create$delegate$1 extends Lambda implements Function0<File> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function0 f23831a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreFactory$create$delegate$1(Function0 function0) {
        super(0);
        this.f23831a = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        File file = (File) this.f23831a.invoke();
        Intrinsics.m18599g(file, "<this>");
        String name = file.getName();
        Intrinsics.m18598f(name, "getName(...)");
        if (StringsKt.m20420R('.', name, "").equals("preferences_pb")) {
            return file;
        }
        throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
    }
}
