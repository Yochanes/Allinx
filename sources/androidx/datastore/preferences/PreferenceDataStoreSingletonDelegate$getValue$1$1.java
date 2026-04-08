package androidx.datastore.preferences;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m18302d2 = {"<anonymous>", "Ljava/io/File;"}, m18303k = 3, m18304mv = {1, 5, 1}, m18306xi = 48)
final class PreferenceDataStoreSingletonDelegate$getValue$1$1 extends Lambda implements Function0<File> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f23810a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PreferenceDataStoreSingletonDelegate f23811b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreSingletonDelegate$getValue$1$1(Context context, PreferenceDataStoreSingletonDelegate preferenceDataStoreSingletonDelegate) {
        super(0);
        this.f23810a = context;
        this.f23811b = preferenceDataStoreSingletonDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.f23810a;
        String name = this.f23811b.f23804a;
        Intrinsics.m18599g(name, "name");
        String fileName = Intrinsics.m18604l(".preferences_pb", name);
        Intrinsics.m18599g(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), Intrinsics.m18604l(fileName, "datastore/"));
    }
}
