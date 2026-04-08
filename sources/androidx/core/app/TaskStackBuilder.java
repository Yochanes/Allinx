package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class TaskStackBuilder implements Iterable<Intent> {

    /* JADX INFO: renamed from: a */
    public final ArrayList f23111a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final Context f23112b;

    /* JADX INFO: compiled from: Proguard */
    public interface SupportParentable {
        Intent getSupportParentActivityIntent();
    }

    public TaskStackBuilder(Context context) {
        this.f23112b = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m7479a(ComponentName componentName) {
        Context context = this.f23112b;
        ArrayList arrayList = this.f23111a;
        int size = arrayList.size();
        try {
            for (Intent intentM7404a = NavUtils.m7404a(context, componentName); intentM7404a != null; intentM7404a = NavUtils.m7404a(context, intentM7404a.getComponent())) {
                arrayList.add(size, intentM7404a);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7480c() {
        ArrayList arrayList = this.f23111a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f23112b.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator<Intent> iterator() {
        return this.f23111a.iterator();
    }
}
