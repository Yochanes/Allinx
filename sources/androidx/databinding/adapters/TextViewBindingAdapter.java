package androidx.databinding.adapters;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethods;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@BindingMethods
@RestrictTo
public class TextViewBindingAdapter {

    /* JADX INFO: compiled from: Proguard */
    public interface AfterTextChanged {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface BeforeTextChanged {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnTextChanged {
    }

    /* JADX INFO: renamed from: androidx.databinding.adapters.TextViewBindingAdapter$1 */
    /* JADX INFO: compiled from: Proguard */
    class C15231 implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
