package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.quirk.ProfileResolutionQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class EncoderProfilesResolutionValidator {

    /* JADX INFO: renamed from: a */
    public final ArrayList f2707a;

    /* JADX INFO: renamed from: b */
    public final Set f2708b;

    public EncoderProfilesResolutionValidator(ArrayList arrayList) {
        Set set;
        ArrayList arrayList2 = new ArrayList();
        this.f2707a = arrayList2;
        arrayList2.addAll(arrayList);
        if (arrayList.isEmpty()) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet(((ProfileResolutionQuirk) arrayList.get(0)).mo1152b());
            for (int i = 1; i < arrayList.size(); i++) {
                hashSet.retainAll(((ProfileResolutionQuirk) arrayList.get(i)).mo1152b());
            }
            set = hashSet;
        }
        this.f2708b = set;
    }
}
