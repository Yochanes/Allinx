package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Range;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class CaptureConfig {

    /* JADX INFO: renamed from: i */
    public static final Config.Option f2665i = new AutoValue_Config_Option("camerax.core.captureConfig.rotation", Integer.TYPE, null);

    /* JADX INFO: renamed from: j */
    public static final Config.Option f2666j = new AutoValue_Config_Option("camerax.core.captureConfig.jpegQuality", Integer.class, null);

    /* JADX INFO: renamed from: k */
    public static final Config.Option f2667k = new AutoValue_Config_Option("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);

    /* JADX INFO: renamed from: a */
    public final ArrayList f2668a;

    /* JADX INFO: renamed from: b */
    public final OptionsBundle f2669b;

    /* JADX INFO: renamed from: c */
    public final int f2670c;

    /* JADX INFO: renamed from: d */
    public final Range f2671d;

    /* JADX INFO: renamed from: e */
    public final List f2672e;

    /* JADX INFO: renamed from: f */
    public final boolean f2673f;

    /* JADX INFO: renamed from: g */
    public final TagBundle f2674g;

    /* JADX INFO: renamed from: h */
    public final CameraCaptureResult f2675h;

    /* JADX INFO: compiled from: Proguard */
    public interface OptionUnpacker {
        /* JADX INFO: renamed from: a */
        void mo963a(ImageCaptureConfig imageCaptureConfig, Builder builder);
    }

    public CaptureConfig(ArrayList arrayList, OptionsBundle optionsBundle, int i, Range range, ArrayList arrayList2, boolean z2, TagBundle tagBundle, CameraCaptureResult cameraCaptureResult) {
        this.f2668a = arrayList;
        this.f2669b = optionsBundle;
        this.f2670c = i;
        this.f2671d = range;
        this.f2672e = Collections.unmodifiableList(arrayList2);
        this.f2673f = z2;
        this.f2674g = tagBundle;
        this.f2675h = cameraCaptureResult;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public final HashSet f2676a;

        /* JADX INFO: renamed from: b */
        public MutableOptionsBundle f2677b;

        /* JADX INFO: renamed from: c */
        public int f2678c;

        /* JADX INFO: renamed from: d */
        public final Range f2679d;

        /* JADX INFO: renamed from: e */
        public final ArrayList f2680e;

        /* JADX INFO: renamed from: f */
        public boolean f2681f;

        /* JADX INFO: renamed from: g */
        public final MutableTagBundle f2682g;

        /* JADX INFO: renamed from: h */
        public CameraCaptureResult f2683h;

        public Builder() {
            this.f2676a = new HashSet();
            this.f2677b = MutableOptionsBundle.m1507T();
            this.f2678c = -1;
            this.f2679d = StreamSpec.f2781a;
            this.f2680e = new ArrayList();
            this.f2681f = false;
            this.f2682g = new MutableTagBundle(new ArrayMap());
        }

        /* JADX INFO: renamed from: a */
        public final void m1457a(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                m1458b((CameraCaptureCallback) it.next());
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m1458b(CameraCaptureCallback cameraCaptureCallback) {
            ArrayList arrayList = this.f2680e;
            if (arrayList.contains(cameraCaptureCallback)) {
                return;
            }
            arrayList.add(cameraCaptureCallback);
        }

        /* JADX INFO: renamed from: c */
        public final void m1459c(Config config) {
            Object objMo1464a;
            for (Config.Option option : config.mo1467e()) {
                MutableOptionsBundle mutableOptionsBundle = this.f2677b;
                mutableOptionsBundle.getClass();
                try {
                    objMo1464a = mutableOptionsBundle.mo1464a(option);
                } catch (IllegalArgumentException unused) {
                    objMo1464a = null;
                }
                Object objMo1464a2 = config.mo1464a(option);
                if (objMo1464a instanceof MultiValueSet) {
                    MultiValueSet multiValueSet = (MultiValueSet) objMo1464a2;
                    multiValueSet.getClass();
                    ((MultiValueSet) objMo1464a).f2748a.addAll(Collections.unmodifiableList(new ArrayList(multiValueSet.f2748a)));
                } else {
                    if (objMo1464a2 instanceof MultiValueSet) {
                        objMo1464a2 = ((MultiValueSet) objMo1464a2).mo818a();
                    }
                    this.f2677b.m1509V(option, config.mo1469g(option), objMo1464a2);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m1460d(DeferrableSurface deferrableSurface) {
            this.f2676a.add(deferrableSurface);
        }

        /* JADX INFO: renamed from: e */
        public final CaptureConfig m1461e() {
            ArrayList arrayList = new ArrayList(this.f2676a);
            OptionsBundle optionsBundleM1511S = OptionsBundle.m1511S(this.f2677b);
            int i = this.f2678c;
            ArrayList arrayList2 = new ArrayList(this.f2680e);
            boolean z2 = this.f2681f;
            TagBundle tagBundle = TagBundle.f2798b;
            ArrayMap arrayMap = new ArrayMap();
            MutableTagBundle mutableTagBundle = this.f2682g;
            for (String str : mutableTagBundle.f2799a.keySet()) {
                arrayMap.put(str, mutableTagBundle.f2799a.get(str));
            }
            return new CaptureConfig(arrayList, optionsBundleM1511S, i, this.f2679d, arrayList2, z2, new TagBundle(arrayMap), this.f2683h);
        }

        public Builder(CaptureConfig captureConfig) {
            HashSet hashSet = new HashSet();
            this.f2676a = hashSet;
            this.f2677b = MutableOptionsBundle.m1507T();
            this.f2678c = -1;
            this.f2679d = StreamSpec.f2781a;
            ArrayList arrayList = new ArrayList();
            this.f2680e = arrayList;
            this.f2681f = false;
            this.f2682g = new MutableTagBundle(new ArrayMap());
            hashSet.addAll(captureConfig.f2668a);
            this.f2677b = MutableOptionsBundle.m1508U(captureConfig.f2669b);
            this.f2678c = captureConfig.f2670c;
            this.f2679d = captureConfig.f2671d;
            arrayList.addAll(captureConfig.f2672e);
            this.f2681f = captureConfig.f2673f;
            ArrayMap arrayMap = new ArrayMap();
            TagBundle tagBundle = captureConfig.f2674g;
            for (String str : tagBundle.f2799a.keySet()) {
                arrayMap.put(str, tagBundle.f2799a.get(str));
            }
            this.f2682g = new MutableTagBundle(arrayMap);
        }
    }
}
