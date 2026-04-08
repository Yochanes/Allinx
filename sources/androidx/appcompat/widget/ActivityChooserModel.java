package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class ActivityChooserModel extends DataSetObservable {

    /* JADX INFO: renamed from: h */
    public static final Object f1029h = new Object();

    /* JADX INFO: renamed from: i */
    public static final HashMap f1030i = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Object f1031a = new Object();

    /* JADX INFO: renamed from: b */
    public final ArrayList f1032b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f1033c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ActivitySorter f1034d;

    /* JADX INFO: renamed from: e */
    public final int f1035e;

    /* JADX INFO: renamed from: f */
    public boolean f1036f;

    /* JADX INFO: renamed from: g */
    public boolean f1037g;

    /* JADX INFO: compiled from: Proguard */
    public interface ActivityChooserModelClient {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ActivityResolveInfo implements Comparable<ActivityResolveInfo> {
        @Override // java.lang.Comparable
        public final int compareTo(ActivityResolveInfo activityResolveInfo) {
            activityResolveInfo.getClass();
            return Float.floatToIntBits(0.0f) - Float.floatToIntBits(0.0f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ActivityResolveInfo.class != obj.getClass()) {
                return false;
            }
            return Float.floatToIntBits(0.0f) == Float.floatToIntBits(0.0f);
        }

        public final int hashCode() {
            return Float.floatToIntBits(0.0f) + 31;
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ActivitySorter {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class DefaultSorter implements ActivitySorter {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class HistoricalRecord {

        /* JADX INFO: renamed from: a */
        public final ComponentName f1038a;

        /* JADX INFO: renamed from: b */
        public final long f1039b;

        /* JADX INFO: renamed from: c */
        public final float f1040c;

        public HistoricalRecord(ComponentName componentName, long j, float f) {
            this.f1038a = componentName;
            this.f1039b = j;
            this.f1040c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || HistoricalRecord.class != obj.getClass()) {
                return false;
            }
            HistoricalRecord historicalRecord = (HistoricalRecord) obj;
            ComponentName componentName = historicalRecord.f1038a;
            ComponentName componentName2 = this.f1038a;
            if (componentName2 == null) {
                if (componentName != null) {
                    return false;
                }
            } else if (!componentName2.equals(componentName)) {
                return false;
            }
            return this.f1039b == historicalRecord.f1039b && Float.floatToIntBits(this.f1040c) == Float.floatToIntBits(historicalRecord.f1040c);
        }

        public final int hashCode() {
            ComponentName componentName = this.f1038a;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j = this.f1039b;
            return Float.floatToIntBits(this.f1040c) + ((((iHashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31);
        }

        public final String toString() {
            return "[; activity:" + this.f1038a + "; time:" + this.f1039b + "; weight:" + new BigDecimal(this.f1040c) + "]";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnChooseActivityListener {
    }

    /* JADX INFO: compiled from: Proguard */
    public final class PersistHistoryAsyncTask extends AsyncTask<Object, Void, Void> {
        @Override // android.os.AsyncTask
        public final Void doInBackground(Object[] objArr) {
            throw null;
        }
    }

    public ActivityChooserModel() {
        DefaultSorter defaultSorter = new DefaultSorter();
        new HashMap();
        this.f1034d = defaultSorter;
        this.f1035e = 50;
        this.f1036f = true;
        this.f1037g = true;
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static ActivityChooserModel m521b() {
        ActivityChooserModel activityChooserModel;
        synchronized (f1029h) {
            try {
                activityChooserModel = (ActivityChooserModel) f1030i.get(null);
                if (activityChooserModel == null) {
                    new ActivityChooserModel();
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return activityChooserModel;
    }

    /* JADX INFO: renamed from: a */
    public final void m522a() {
        if (this.f1036f && this.f1037g && !TextUtils.isEmpty(null)) {
            this.f1036f = false;
            throw null;
        }
        ArrayList arrayList = this.f1033c;
        int size = arrayList.size() - this.f1035e;
        if (size <= 0) {
            return;
        }
        this.f1037g = true;
        for (int i = 0; i < size; i++) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final ResolveInfo m523c() {
        synchronized (this.f1031a) {
            try {
                m522a();
                if (!this.f1032b.isEmpty()) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }
}
