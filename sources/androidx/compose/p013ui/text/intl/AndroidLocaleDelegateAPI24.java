package androidx.compose.p013ui.text.intl;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.text.platform.SynchronizedObject;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/intl/AndroidLocaleDelegateAPI24;", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@RequiresApi
@SourceDebugExtension
public final class AndroidLocaleDelegateAPI24 implements PlatformLocaleDelegate {

    /* JADX INFO: renamed from: a */
    public LocaleList f20444a;

    /* JADX INFO: renamed from: b */
    public LocaleList f20445b;

    /* JADX INFO: renamed from: c */
    public final SynchronizedObject f20446c = new SynchronizedObject();

    /* JADX INFO: renamed from: a */
    public final LocaleList m6570a() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f20446c) {
            LocaleList localeList2 = this.f20445b;
            if (localeList2 != null && localeList == this.f20444a) {
                return localeList2;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new Locale(localeList.get(i)));
            }
            LocaleList localeList3 = new LocaleList(arrayList);
            this.f20444a = localeList;
            this.f20445b = localeList3;
            return localeList3;
        }
    }
}
