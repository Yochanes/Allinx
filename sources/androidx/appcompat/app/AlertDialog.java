package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertController.AlertParams.C00601;
import androidx.appcompat.app.AlertController.AlertParams.C00612;
import androidx.appcompat.app.AlertController.AlertParams.C00623;
import androidx.appcompat.app.AlertController.AlertParams.C00634;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.p013ui.platform.ComposeView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AlertDialog extends AppCompatDialog implements DialogInterface {

    /* JADX INFO: renamed from: a */
    public final AlertController f387a;

    /* JADX INFO: compiled from: Proguard */
    public static class Builder {

        /* JADX INFO: renamed from: P */
        private final AlertController.AlertParams f388P;
        private final int mTheme;

        public Builder(Context context) {
            this(context, AlertDialog.m255d(context, 0));
        }

        @NonNull
        public AlertDialog create() {
            AlertController alertController;
            ListAdapter simpleCursorAdapter;
            AlertDialog alertDialog = new AlertDialog(this.f388P.f346a, this.mTheme);
            AlertController.AlertParams alertParams = this.f388P;
            View view = alertParams.f351f;
            AlertController alertController2 = alertDialog.f387a;
            if (view != null) {
                alertController2.f295G = view;
            } else {
                CharSequence charSequence = alertParams.f350e;
                if (charSequence != null) {
                    alertController2.f310e = charSequence;
                    TextView textView = alertController2.f293E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = alertParams.f349d;
                if (drawable != null) {
                    alertController2.f291C = drawable;
                    alertController2.f290B = 0;
                    ImageView imageView = alertController2.f292D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController2.f292D.setImageDrawable(drawable);
                    }
                }
                int i = alertParams.f348c;
                if (i != 0) {
                    alertController2.f291C = null;
                    alertController2.f290B = i;
                    ImageView imageView2 = alertController2.f292D;
                    if (imageView2 != null) {
                        if (i != 0) {
                            imageView2.setVisibility(0);
                            alertController2.f292D.setImageResource(alertController2.f290B);
                        } else {
                            imageView2.setVisibility(8);
                        }
                    }
                }
            }
            CharSequence charSequence2 = alertParams.f352g;
            if (charSequence2 != null) {
                alertController2.f311f = charSequence2;
                TextView textView2 = alertController2.f294F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = alertParams.f353h;
            if (charSequence3 != null || alertParams.f354i != null) {
                alertController2.m253c(-1, charSequence3, alertParams.f355j, alertParams.f354i);
            }
            CharSequence charSequence4 = alertParams.f356k;
            if (charSequence4 != null || alertParams.f357l != null) {
                alertController2.m253c(-2, charSequence4, alertParams.f358m, alertParams.f357l);
            }
            CharSequence charSequence5 = alertParams.f359n;
            if (charSequence5 != null || alertParams.f360o != null) {
                alertController2.m253c(-3, charSequence5, alertParams.f361p, alertParams.f360o);
            }
            if (alertParams.f366u == null && alertParams.f342J == null && alertParams.f367v == null) {
                alertController = alertController2;
            } else {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) alertParams.f347b.inflate(alertController2.f299K, (ViewGroup) null);
                boolean z2 = alertParams.f338F;
                ContextThemeWrapper contextThemeWrapper = alertParams.f346a;
                if (!z2) {
                    alertController = alertController2;
                    int i2 = alertParams.f339G ? alertController.f301M : alertController.f302N;
                    if (alertParams.f342J != null) {
                        simpleCursorAdapter = new SimpleCursorAdapter(contextThemeWrapper, i2, alertParams.f342J, new String[]{alertParams.f343K}, new int[]{R.id.text1});
                    } else {
                        ListAdapter checkedItemAdapter = alertParams.f367v;
                        if (checkedItemAdapter == null) {
                            checkedItemAdapter = new AlertController.CheckedItemAdapter(contextThemeWrapper, i2, R.id.text1, alertParams.f366u);
                        }
                        simpleCursorAdapter = checkedItemAdapter;
                    }
                } else if (alertParams.f342J == null) {
                    simpleCursorAdapter = alertParams.new C00601(contextThemeWrapper, alertController2.f300L, alertParams.f366u, recycleListView);
                    recycleListView = recycleListView;
                    alertController = alertController2;
                } else {
                    alertController = alertController2;
                    simpleCursorAdapter = alertParams.new C00612(contextThemeWrapper, alertParams.f342J, recycleListView, alertController);
                }
                alertController.f296H = simpleCursorAdapter;
                alertController.f297I = alertParams.f340H;
                if (alertParams.f368w != null) {
                    recycleListView.setOnItemClickListener(alertParams.new C00623(alertController));
                } else if (alertParams.f341I != null) {
                    recycleListView.setOnItemClickListener(alertParams.new C00634(recycleListView, alertController));
                }
                AdapterView.OnItemSelectedListener onItemSelectedListener = alertParams.f345M;
                if (onItemSelectedListener != null) {
                    recycleListView.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (alertParams.f339G) {
                    recycleListView.setChoiceMode(1);
                } else if (alertParams.f338F) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f312g = recycleListView;
            }
            View view2 = alertParams.f370y;
            if (view2 == null) {
                int i3 = alertParams.f369x;
                if (i3 != 0) {
                    alertController.f313h = null;
                    alertController.f314i = i3;
                    alertController.f319n = false;
                }
            } else if (alertParams.f336D) {
                int i4 = alertParams.f371z;
                int i5 = alertParams.f333A;
                int i6 = alertParams.f334B;
                int i7 = alertParams.f335C;
                alertController.f313h = view2;
                alertController.f314i = 0;
                alertController.f319n = true;
                alertController.f315j = i4;
                alertController.f316k = i5;
                alertController.f317l = i6;
                alertController.f318m = i7;
            } else {
                alertController.f313h = view2;
                alertController.f314i = 0;
                alertController.f319n = false;
            }
            alertDialog.setCancelable(this.f388P.f362q);
            if (this.f388P.f362q) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.f388P.f363r);
            alertDialog.setOnDismissListener(this.f388P.f364s);
            DialogInterface.OnKeyListener onKeyListener = this.f388P.f365t;
            if (onKeyListener != null) {
                alertDialog.setOnKeyListener(onKeyListener);
            }
            return alertDialog;
        }

        @NonNull
        public Context getContext() {
            return this.f388P.f346a;
        }

        public Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f367v = listAdapter;
            alertParams.f368w = onClickListener;
            return this;
        }

        public Builder setCancelable(boolean z2) {
            this.f388P.f362q = z2;
            return this;
        }

        public Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f342J = cursor;
            alertParams.f343K = str;
            alertParams.f368w = onClickListener;
            return this;
        }

        public Builder setCustomTitle(@Nullable View view) {
            this.f388P.f351f = view;
            return this;
        }

        public Builder setIcon(@DrawableRes int i) {
            this.f388P.f348c = i;
            return this;
        }

        public Builder setIconAttribute(@AttrRes int i) {
            TypedValue typedValue = new TypedValue();
            this.f388P.f346a.getTheme().resolveAttribute(i, typedValue, true);
            this.f388P.f348c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public Builder setInverseBackgroundForced(boolean z2) {
            this.f388P.getClass();
            return this;
        }

        public Builder setItems(@ArrayRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f366u = alertParams.f346a.getResources().getTextArray(i);
            this.f388P.f368w = onClickListener;
            return this;
        }

        public Builder setMessage(@StringRes int i) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f352g = alertParams.f346a.getText(i);
            return this;
        }

        public Builder setMultiChoiceItems(@ArrayRes int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f366u = alertParams.f346a.getResources().getTextArray(i);
            AlertController.AlertParams alertParams2 = this.f388P;
            alertParams2.f341I = onMultiChoiceClickListener;
            alertParams2.f337E = zArr;
            alertParams2.f338F = true;
            return this;
        }

        public Builder setNegativeButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f356k = alertParams.f346a.getText(i);
            this.f388P.f358m = onClickListener;
            return this;
        }

        public Builder setNegativeButtonIcon(Drawable drawable) {
            this.f388P.f357l = drawable;
            return this;
        }

        public Builder setNeutralButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f359n = alertParams.f346a.getText(i);
            this.f388P.f361p = onClickListener;
            return this;
        }

        public Builder setNeutralButtonIcon(Drawable drawable) {
            this.f388P.f360o = drawable;
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f388P.f363r = onCancelListener;
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f388P.f364s = onDismissListener;
            return this;
        }

        public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f388P.f345M = onItemSelectedListener;
            return this;
        }

        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f388P.f365t = onKeyListener;
            return this;
        }

        public Builder setPositiveButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f353h = alertParams.f346a.getText(i);
            this.f388P.f355j = onClickListener;
            return this;
        }

        public Builder setPositiveButtonIcon(Drawable drawable) {
            this.f388P.f354i = drawable;
            return this;
        }

        @RestrictTo
        public Builder setRecycleOnMeasureEnabled(boolean z2) {
            this.f388P.getClass();
            return this;
        }

        public Builder setSingleChoiceItems(@ArrayRes int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f366u = alertParams.f346a.getResources().getTextArray(i);
            AlertController.AlertParams alertParams2 = this.f388P;
            alertParams2.f368w = onClickListener;
            alertParams2.f340H = i2;
            alertParams2.f339G = true;
            return this;
        }

        public Builder setTitle(@StringRes int i) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f350e = alertParams.f346a.getText(i);
            return this;
        }

        public Builder setView(int i) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f370y = null;
            alertParams.f369x = i;
            alertParams.f336D = false;
            return this;
        }

        public AlertDialog show() {
            AlertDialog alertDialogCreate = create();
            alertDialogCreate.show();
            return alertDialogCreate;
        }

        public Builder(@NonNull Context context, @StyleRes int i) {
            this.f388P = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.m255d(context, i)));
            this.mTheme = i;
        }

        public Builder setIcon(@Nullable Drawable drawable) {
            this.f388P.f349d = drawable;
            return this;
        }

        public Builder setMessage(@Nullable CharSequence charSequence) {
            this.f388P.f352g = charSequence;
            return this;
        }

        public Builder setTitle(@Nullable CharSequence charSequence) {
            this.f388P.f350e = charSequence;
            return this;
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f366u = charSequenceArr;
            alertParams.f368w = onClickListener;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f356k = charSequence;
            alertParams.f358m = onClickListener;
            return this;
        }

        public Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f359n = charSequence;
            alertParams.f361p = onClickListener;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f353h = charSequence;
            alertParams.f355j = onClickListener;
            return this;
        }

        public Builder setView(View view) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f370y = view;
            alertParams.f369x = 0;
            alertParams.f336D = false;
            return this;
        }

        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f366u = charSequenceArr;
            alertParams.f341I = onMultiChoiceClickListener;
            alertParams.f337E = zArr;
            alertParams.f338F = true;
            return this;
        }

        public Builder setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f342J = cursor;
            alertParams.f368w = onClickListener;
            alertParams.f340H = i;
            alertParams.f343K = str;
            alertParams.f339G = true;
            return this;
        }

        @RestrictTo
        @Deprecated
        public Builder setView(View view, int i, int i2, int i3, int i4) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f370y = view;
            alertParams.f369x = 0;
            alertParams.f336D = true;
            alertParams.f371z = i;
            alertParams.f333A = i2;
            alertParams.f334B = i3;
            alertParams.f335C = i4;
            return this;
        }

        public Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f342J = cursor;
            alertParams.f341I = onMultiChoiceClickListener;
            alertParams.f344L = str;
            alertParams.f343K = str2;
            alertParams.f338F = true;
            return this;
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f366u = charSequenceArr;
            alertParams.f368w = onClickListener;
            alertParams.f340H = i;
            alertParams.f339G = true;
            return this;
        }

        public Builder setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f388P;
            alertParams.f367v = listAdapter;
            alertParams.f368w = onClickListener;
            alertParams.f340H = i;
            alertParams.f339G = true;
            return this;
        }
    }

    public AlertDialog(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, m255d(contextThemeWrapper, i));
        this.f387a = new AlertController(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: d */
    public static int m255d(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.exchange.allin.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: renamed from: b */
    public final Button m256b(int i) {
        AlertController alertController = this.f387a;
        if (i == -3) {
            return alertController.f328w;
        }
        if (i == -2) {
            return alertController.f324s;
        }
        if (i == -1) {
            return alertController.f320o;
        }
        alertController.getClass();
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final AlertController.RecycleListView m257c() {
        return this.f387a.f312g;
    }

    /* JADX INFO: renamed from: e */
    public final void m258e(ComposeView composeView) {
        AlertController alertController = this.f387a;
        alertController.f313h = composeView;
        alertController.f314i = 0;
        alertController.f319n = false;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        View view;
        int i2;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f387a;
        alertController.f307b.setContentView(alertController.f298J);
        Window window = alertController.f308c;
        View viewFindViewById2 = window.findViewById(com.exchange.allin.R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(com.exchange.allin.R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(com.exchange.allin.R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(com.exchange.allin.R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(com.exchange.allin.R.id.customPanel);
        View viewInflate = alertController.f313h;
        Context context = alertController.f306a;
        if (viewInflate == null) {
            viewInflate = alertController.f314i != 0 ? LayoutInflater.from(context).inflate(alertController.f314i, viewGroup, false) : null;
        }
        boolean z2 = viewInflate != null;
        if (!z2 || !AlertController.m251a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(com.exchange.allin.R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f319n) {
                frameLayout.setPadding(alertController.f315j, alertController.f316k, alertController.f317l, alertController.f318m);
            }
            if (alertController.f312g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(com.exchange.allin.R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(com.exchange.allin.R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(com.exchange.allin.R.id.buttonPanel);
        ViewGroup viewGroupM252b = AlertController.m252b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM252b2 = AlertController.m252b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM252b3 = AlertController.m252b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(com.exchange.allin.R.id.scrollView);
        alertController.f289A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f289A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM252b2.findViewById(R.id.message);
        alertController.f294F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f311f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.f289A.removeView(alertController.f294F);
                if (alertController.f312g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f289A.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.f289A);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.f312g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM252b2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupM252b3.findViewById(R.id.button1);
        alertController.f320o = button;
        View.OnClickListener onClickListener = alertController.f305Q;
        button.setOnClickListener(onClickListener);
        boolean zIsEmpty = TextUtils.isEmpty(alertController.f321p);
        int i3 = alertController.f309d;
        if (zIsEmpty && alertController.f323r == null) {
            alertController.f320o.setVisibility(8);
            i = 0;
        } else {
            alertController.f320o.setText(alertController.f321p);
            Drawable drawable = alertController.f323r;
            if (drawable != null) {
                drawable.setBounds(0, 0, i3, i3);
                alertController.f320o.setCompoundDrawables(alertController.f323r, null, null, null);
            }
            alertController.f320o.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupM252b3.findViewById(R.id.button2);
        alertController.f324s = button2;
        button2.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(alertController.f325t) && alertController.f327v == null) {
            alertController.f324s.setVisibility(8);
        } else {
            alertController.f324s.setText(alertController.f325t);
            Drawable drawable2 = alertController.f327v;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i3, i3);
                alertController.f324s.setCompoundDrawables(alertController.f327v, null, null, null);
            }
            alertController.f324s.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupM252b3.findViewById(R.id.button3);
        alertController.f328w = button3;
        button3.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(alertController.f329x) && alertController.f331z == null) {
            alertController.f328w.setVisibility(8);
            view = null;
        } else {
            alertController.f328w.setText(alertController.f329x);
            Drawable drawable3 = alertController.f331z;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i3, i3);
                view = null;
                alertController.f328w.setCompoundDrawables(alertController.f331z, null, null, null);
            } else {
                view = null;
            }
            alertController.f328w.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.exchange.allin.R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = alertController.f320o;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = alertController.f324s;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = alertController.f328w;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupM252b3.setVisibility(8);
        }
        if (alertController.f295G != null) {
            viewGroupM252b.addView(alertController.f295G, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(com.exchange.allin.R.id.title_template).setVisibility(8);
        } else {
            alertController.f292D = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(alertController.f310e) || !alertController.f303O) {
                window.findViewById(com.exchange.allin.R.id.title_template).setVisibility(8);
                alertController.f292D.setVisibility(8);
                viewGroupM252b.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(com.exchange.allin.R.id.alertTitle);
                alertController.f293E = textView2;
                textView2.setText(alertController.f310e);
                int i4 = alertController.f290B;
                if (i4 != 0) {
                    alertController.f292D.setImageResource(i4);
                } else {
                    Drawable drawable4 = alertController.f291C;
                    if (drawable4 != null) {
                        alertController.f292D.setImageDrawable(drawable4);
                    } else {
                        alertController.f293E.setPadding(alertController.f292D.getPaddingLeft(), alertController.f292D.getPaddingTop(), alertController.f292D.getPaddingRight(), alertController.f292D.getPaddingBottom());
                        alertController.f292D.setVisibility(8);
                    }
                }
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i5 = (viewGroupM252b == null || viewGroupM252b.getVisibility() == 8) ? 0 : 1;
        boolean z4 = viewGroupM252b3.getVisibility() != 8;
        if (!z4 && (viewFindViewById = viewGroupM252b2.findViewById(com.exchange.allin.R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f289A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (alertController.f311f == null && alertController.f312g == null) ? view : viewGroupM252b.findViewById(com.exchange.allin.R.id.titleDividerNoCustom);
            i2 = 0;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            i2 = 0;
            View viewFindViewById10 = viewGroupM252b2.findViewById(com.exchange.allin.R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f312g;
        if (recycleListView != null) {
            recycleListView.getClass();
            if (!z4 || i5 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i5 != 0 ? recycleListView.getPaddingTop() : recycleListView.f385a, recycleListView.getPaddingRight(), z4 ? recycleListView.getPaddingBottom() : recycleListView.f386b);
            }
        }
        if (!z3) {
            ViewGroup viewGroup3 = alertController.f312g;
            if (viewGroup3 == null) {
                viewGroup3 = alertController.f289A;
            }
            if (viewGroup3 != null) {
                int i6 = z4 ? 2 : i2;
                View viewFindViewById11 = window.findViewById(com.exchange.allin.R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(com.exchange.allin.R.id.scrollIndicatorDown);
                ViewCompat.m7776L(viewGroup3, i5 | i6);
                if (viewFindViewById11 != null) {
                    viewGroupM252b2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM252b2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f312g;
        if (recycleListView2 == null || (listAdapter = alertController.f296H) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i7 = alertController.f297I;
        if (i7 > -1) {
            recycleListView2.setItemChecked(i7, true);
            recycleListView2.setSelection(i7);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f387a.f289A;
        if (nestedScrollView == null || !nestedScrollView.m8175d(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f387a.f289A;
        if (nestedScrollView == null || !nestedScrollView.m8175d(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f387a;
        alertController.f310e = charSequence;
        TextView textView = alertController.f293E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
