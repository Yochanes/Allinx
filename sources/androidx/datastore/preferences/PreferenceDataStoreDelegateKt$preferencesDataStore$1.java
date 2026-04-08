package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.preferences.core.Preferences;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m18302d2 = {"<anonymous>", "", "Landroidx/datastore/core/DataMigration;", "Landroidx/datastore/preferences/core/Preferences;", "it", "Landroid/content/Context;"}, m18303k = 3, m18304mv = {1, 5, 1}, m18306xi = 48)
final class PreferenceDataStoreDelegateKt$preferencesDataStore$1 extends Lambda implements Function1<Context, List<? extends DataMigration<Preferences>>> {

    /* JADX INFO: renamed from: a */
    public static final PreferenceDataStoreDelegateKt$preferencesDataStore$1 f23803a = new PreferenceDataStoreDelegateKt$preferencesDataStore$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.m18599g(it, "it");
        return EmptyList.f51496a;
    }
}
