package androidx.databinding;

import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class MergedDataBinderMapper extends DataBinderMapper {

    /* JADX INFO: renamed from: a */
    public final HashSet f23657a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f23658b = new CopyOnWriteArrayList();

    public MergedDataBinderMapper() {
        new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: b */
    public final void m8238b(DataBinderMapper dataBinderMapper) {
        if (this.f23657a.add(dataBinderMapper.getClass())) {
            this.f23658b.add(dataBinderMapper);
            Iterator it = dataBinderMapper.mo8237a().iterator();
            while (it.hasNext()) {
                m8238b((DataBinderMapper) it.next());
            }
        }
    }
}
