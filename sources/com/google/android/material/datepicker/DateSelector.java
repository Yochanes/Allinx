package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.util.Pair;
import com.google.android.material.internal.ViewUtils;
import java.text.SimpleDateFormat;
import java.util.Collection;
import p007I.RunnableC0015a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public interface DateSelector<S> extends Parcelable {
    /* JADX INFO: renamed from: C */
    static /* synthetic */ void m14681C(EditText[] editTextArr, View view, boolean z2) {
        lambda$showKeyboardWithAutoHideBehavior$0(editTextArr, view, z2);
    }

    /* JADX INFO: renamed from: i */
    static /* synthetic */ void m14682i(EditText editText) {
        lambda$showKeyboardWithAutoHideBehavior$1(editText);
    }

    private static /* synthetic */ void lambda$showKeyboardWithAutoHideBehavior$0(EditText[] editTextArr, View view, boolean z2) {
        for (EditText editText : editTextArr) {
            if (editText.hasFocus()) {
                return;
            }
        }
        ViewUtils.hideKeyboard(view, false);
    }

    private static /* synthetic */ void lambda$showKeyboardWithAutoHideBehavior$1(View view) {
        ViewUtils.requestFocusAndShowKeyboard(view, false);
    }

    static void showKeyboardWithAutoHideBehavior(@NonNull EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        ViewOnFocusChangeListenerC3852c viewOnFocusChangeListenerC3852c = new ViewOnFocusChangeListenerC3852c(editTextArr);
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(viewOnFocusChangeListenerC3852c);
        }
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new RunnableC0015a(editText2, 21), 100L);
    }

    @StyleRes
    int getDefaultThemeResId(Context context);

    @StringRes
    int getDefaultTitleResId();

    @Nullable
    String getError();

    @NonNull
    Collection<Long> getSelectedDays();

    @NonNull
    Collection<Pair<Long, Long>> getSelectedRanges();

    @Nullable
    S getSelection();

    @NonNull
    String getSelectionContentDescription(@NonNull Context context);

    @NonNull
    String getSelectionDisplayString(Context context);

    boolean isSelectionComplete();

    @NonNull
    View onCreateTextInputView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, @NonNull CalendarConstraints calendarConstraints, @NonNull OnSelectionChangedListener<S> onSelectionChangedListener);

    void select(long j);

    void setSelection(@NonNull S s);

    void setTextInputFormat(@Nullable SimpleDateFormat simpleDateFormat);
}
