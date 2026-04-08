package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.google.android.material.internal.MaterialCheckable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
@UiThread
public class CheckableGroup<T extends MaterialCheckable<T>> {
    private final Map<Integer, T> checkables = new HashMap();
    private final Set<Integer> checkedIds = new HashSet();
    private OnCheckedStateChangeListener onCheckedStateChangeListener;
    private boolean selectionRequired;
    private boolean singleSelection;

    /* JADX INFO: renamed from: com.google.android.material.internal.CheckableGroup$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C38711 implements MaterialCheckable.OnCheckedChangeListener<T> {
        public C38711() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
        public /* bridge */ /* synthetic */ void onCheckedChanged(Object obj, boolean z2) {
            onCheckedChanged((MaterialCheckable) obj, z2);
        }

        public void onCheckedChanged(T t, boolean z2) {
            if (!z2) {
                CheckableGroup checkableGroup = CheckableGroup.this;
                if (!CheckableGroup.access$200(checkableGroup, t, CheckableGroup.access$100(checkableGroup))) {
                    return;
                }
            } else if (!CheckableGroup.access$000(CheckableGroup.this, t)) {
                return;
            }
            CheckableGroup.access$300(CheckableGroup.this);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(@NonNull Set<Integer> set);
    }

    public static /* synthetic */ boolean access$000(CheckableGroup checkableGroup, MaterialCheckable materialCheckable) {
        return checkableGroup.checkInternal(materialCheckable);
    }

    public static /* synthetic */ boolean access$100(CheckableGroup checkableGroup) {
        return checkableGroup.selectionRequired;
    }

    public static /* synthetic */ boolean access$200(CheckableGroup checkableGroup, MaterialCheckable materialCheckable, boolean z2) {
        return checkableGroup.uncheckInternal(materialCheckable, z2);
    }

    public static /* synthetic */ void access$300(CheckableGroup checkableGroup) {
        checkableGroup.onCheckedStateChanged();
    }

    private boolean checkInternal(@NonNull MaterialCheckable<T> materialCheckable) {
        int id = materialCheckable.getId();
        if (this.checkedIds.contains(Integer.valueOf(id))) {
            return false;
        }
        T t = this.checkables.get(Integer.valueOf(getSingleCheckedId()));
        if (t != null) {
            uncheckInternal(t, false);
        }
        boolean zAdd = this.checkedIds.add(Integer.valueOf(id));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return zAdd;
    }

    private void onCheckedStateChanged() {
        OnCheckedStateChangeListener onCheckedStateChangeListener = this.onCheckedStateChangeListener;
        if (onCheckedStateChangeListener != null) {
            onCheckedStateChangeListener.onCheckedStateChanged(getCheckedIds());
        }
    }

    private boolean uncheckInternal(@NonNull MaterialCheckable<T> materialCheckable, boolean z2) {
        int id = materialCheckable.getId();
        if (!this.checkedIds.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z2 && this.checkedIds.size() == 1 && this.checkedIds.contains(Integer.valueOf(id))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean zRemove = this.checkedIds.remove(Integer.valueOf(id));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return zRemove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addCheckable(T t) {
        this.checkables.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            checkInternal(t);
        }
        t.setInternalOnCheckedChangeListener(new C38711());
    }

    public void check(@IdRes int i) {
        T t = this.checkables.get(Integer.valueOf(i));
        if (t != null && checkInternal(t)) {
            onCheckedStateChanged();
        }
    }

    public void clearCheck() {
        boolean zIsEmpty = this.checkedIds.isEmpty();
        Iterator<T> it = this.checkables.values().iterator();
        while (it.hasNext()) {
            uncheckInternal(it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        onCheckedStateChanged();
    }

    @NonNull
    public Set<Integer> getCheckedIds() {
        return new HashSet(this.checkedIds);
    }

    @NonNull
    public List<Integer> getCheckedIdsSortedByChildOrder(@NonNull ViewGroup viewGroup) {
        Set<Integer> checkedIds = getCheckedIds();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof MaterialCheckable) && checkedIds.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @IdRes
    public int getSingleCheckedId() {
        if (!this.singleSelection || this.checkedIds.isEmpty()) {
            return -1;
        }
        return this.checkedIds.iterator().next().intValue();
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void removeCheckable(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.checkables.remove(Integer.valueOf(t.getId()));
        this.checkedIds.remove(Integer.valueOf(t.getId()));
    }

    public void setOnCheckedStateChangeListener(@Nullable OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.onCheckedStateChangeListener = onCheckedStateChangeListener;
    }

    public void setSelectionRequired(boolean z2) {
        this.selectionRequired = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.singleSelection != z2) {
            this.singleSelection = z2;
            clearCheck();
        }
    }

    public void uncheck(@IdRes int i) {
        T t = this.checkables.get(Integer.valueOf(i));
        if (t != null && uncheckInternal(t, this.selectionRequired)) {
            onCheckedStateChanged();
        }
    }
}
