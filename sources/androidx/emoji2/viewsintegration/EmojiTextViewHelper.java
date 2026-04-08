package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.emoji2.text.EmojiCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class EmojiTextViewHelper {

    /* JADX INFO: renamed from: a */
    public final HelperInternal f24392a;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class HelperInternal19 extends HelperInternal {

        /* JADX INFO: renamed from: a */
        public final TextView f24393a;

        /* JADX INFO: renamed from: b */
        public final EmojiInputFilter f24394b;

        /* JADX INFO: renamed from: c */
        public boolean f24395c = true;

        public HelperInternal19(TextView textView) {
            this.f24393a = textView;
            this.f24394b = new EmojiInputFilter(textView);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        /* JADX INFO: renamed from: a */
        public final InputFilter[] mo8841a(InputFilter[] inputFilterArr) {
            if (!this.f24395c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i = 0; i < inputFilterArr.length; i++) {
                    InputFilter inputFilter = inputFilterArr[i];
                    if (inputFilter instanceof EmojiInputFilter) {
                        sparseArray.put(i, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (sparseArray.indexOfKey(i3) < 0) {
                        inputFilterArr2[i2] = inputFilterArr[i3];
                        i2++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i4 = 0;
            while (true) {
                EmojiInputFilter emojiInputFilter = this.f24394b;
                if (i4 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = emojiInputFilter;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i4] == emojiInputFilter) {
                    return inputFilterArr;
                }
                i4++;
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        /* JADX INFO: renamed from: b */
        public final boolean mo8842b() {
            return this.f24395c;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        /* JADX INFO: renamed from: c */
        public final void mo8843c(boolean z2) {
            if (z2) {
                TextView textView = this.f24393a;
                textView.setTransformationMethod(mo8845e(textView.getTransformationMethod()));
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        /* JADX INFO: renamed from: d */
        public final void mo8844d(boolean z2) {
            this.f24395c = z2;
            TextView textView = this.f24393a;
            textView.setTransformationMethod(mo8845e(textView.getTransformationMethod()));
            textView.setFilters(mo8841a(textView.getFilters()));
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        /* JADX INFO: renamed from: e */
        public final TransformationMethod mo8845e(TransformationMethod transformationMethod) {
            return this.f24395c ? ((transformationMethod instanceof EmojiTransformationMethod) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new EmojiTransformationMethod(transformationMethod) : transformationMethod instanceof EmojiTransformationMethod ? ((EmojiTransformationMethod) transformationMethod).f24401a : transformationMethod;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class SkippingHelper19 extends HelperInternal {

        /* JADX INFO: renamed from: a */
        public final HelperInternal19 f24396a;

        public SkippingHelper19(TextView textView) {
            this.f24396a = new HelperInternal19(textView);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        /* JADX INFO: renamed from: a */
        public final InputFilter[] mo8841a(InputFilter[] inputFilterArr) {
            return !EmojiCompat.m8785g() ? inputFilterArr : this.f24396a.mo8841a(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        /* JADX INFO: renamed from: b */
        public final boolean mo8842b() {
            return this.f24396a.f24395c;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        /* JADX INFO: renamed from: c */
        public final void mo8843c(boolean z2) {
            if (EmojiCompat.m8785g()) {
                this.f24396a.mo8843c(z2);
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        /* JADX INFO: renamed from: d */
        public final void mo8844d(boolean z2) {
            boolean zM8785g = EmojiCompat.m8785g();
            HelperInternal19 helperInternal19 = this.f24396a;
            if (zM8785g) {
                helperInternal19.mo8844d(z2);
            } else {
                helperInternal19.f24395c = z2;
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        /* JADX INFO: renamed from: e */
        public final TransformationMethod mo8845e(TransformationMethod transformationMethod) {
            return !EmojiCompat.m8785g() ? transformationMethod : this.f24396a.mo8845e(transformationMethod);
        }
    }

    public EmojiTextViewHelper(TextView textView) {
        this.f24392a = new SkippingHelper19(textView);
    }

    /* JADX INFO: renamed from: a */
    public final InputFilter[] m8836a(InputFilter[] inputFilterArr) {
        return this.f24392a.mo8841a(inputFilterArr);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8837b() {
        return this.f24392a.mo8842b();
    }

    /* JADX INFO: renamed from: c */
    public final void m8838c(boolean z2) {
        this.f24392a.mo8843c(z2);
    }

    /* JADX INFO: renamed from: d */
    public final void m8839d(boolean z2) {
        this.f24392a.mo8844d(z2);
    }

    /* JADX INFO: renamed from: e */
    public final TransformationMethod m8840e(TransformationMethod transformationMethod) {
        return this.f24392a.mo8845e(transformationMethod);
    }

    /* JADX INFO: compiled from: Proguard */
    public static class HelperInternal {
        /* JADX INFO: renamed from: b */
        public boolean mo8842b() {
            return false;
        }

        /* JADX INFO: renamed from: a */
        public InputFilter[] mo8841a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        /* JADX INFO: renamed from: c */
        public void mo8843c(boolean z2) {
        }

        /* JADX INFO: renamed from: d */
        public void mo8844d(boolean z2) {
        }

        /* JADX INFO: renamed from: e */
        public TransformationMethod mo8845e(TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }
}
