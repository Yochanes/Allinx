package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AlertController {

    /* JADX INFO: renamed from: A */
    public NestedScrollView f289A;

    /* JADX INFO: renamed from: C */
    public Drawable f291C;

    /* JADX INFO: renamed from: D */
    public ImageView f292D;

    /* JADX INFO: renamed from: E */
    public TextView f293E;

    /* JADX INFO: renamed from: F */
    public TextView f294F;

    /* JADX INFO: renamed from: G */
    public View f295G;

    /* JADX INFO: renamed from: H */
    public ListAdapter f296H;

    /* JADX INFO: renamed from: J */
    public final int f298J;

    /* JADX INFO: renamed from: K */
    public final int f299K;

    /* JADX INFO: renamed from: L */
    public final int f300L;

    /* JADX INFO: renamed from: M */
    public final int f301M;

    /* JADX INFO: renamed from: N */
    public final int f302N;

    /* JADX INFO: renamed from: O */
    public final boolean f303O;

    /* JADX INFO: renamed from: P */
    public final Handler f304P;

    /* JADX INFO: renamed from: a */
    public final Context f306a;

    /* JADX INFO: renamed from: b */
    public final AlertDialog f307b;

    /* JADX INFO: renamed from: c */
    public final Window f308c;

    /* JADX INFO: renamed from: d */
    public final int f309d;

    /* JADX INFO: renamed from: e */
    public CharSequence f310e;

    /* JADX INFO: renamed from: f */
    public CharSequence f311f;

    /* JADX INFO: renamed from: g */
    public RecycleListView f312g;

    /* JADX INFO: renamed from: h */
    public View f313h;

    /* JADX INFO: renamed from: i */
    public int f314i;

    /* JADX INFO: renamed from: j */
    public int f315j;

    /* JADX INFO: renamed from: k */
    public int f316k;

    /* JADX INFO: renamed from: l */
    public int f317l;

    /* JADX INFO: renamed from: m */
    public int f318m;

    /* JADX INFO: renamed from: o */
    public Button f320o;

    /* JADX INFO: renamed from: p */
    public CharSequence f321p;

    /* JADX INFO: renamed from: q */
    public Message f322q;

    /* JADX INFO: renamed from: r */
    public Drawable f323r;

    /* JADX INFO: renamed from: s */
    public Button f324s;

    /* JADX INFO: renamed from: t */
    public CharSequence f325t;

    /* JADX INFO: renamed from: u */
    public Message f326u;

    /* JADX INFO: renamed from: v */
    public Drawable f327v;

    /* JADX INFO: renamed from: w */
    public Button f328w;

    /* JADX INFO: renamed from: x */
    public CharSequence f329x;

    /* JADX INFO: renamed from: y */
    public Message f330y;

    /* JADX INFO: renamed from: z */
    public Drawable f331z;

    /* JADX INFO: renamed from: n */
    public boolean f319n = false;

    /* JADX INFO: renamed from: B */
    public int f290B = 0;

    /* JADX INFO: renamed from: I */
    public int f297I = -1;

    /* JADX INFO: renamed from: Q */
    public final View.OnClickListener f305Q = new ViewOnClickListenerC00551();

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$1 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewOnClickListenerC00551 implements View.OnClickListener {
        public ViewOnClickListenerC00551() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f320o || (message3 = alertController.f322q) == null) ? (view != alertController.f324s || (message2 = alertController.f326u) == null) ? (view != alertController.f328w || (message = alertController.f330y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            alertController.f304P.obtainMessage(1, alertController.f307b).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$2 */
    /* JADX INFO: compiled from: Proguard */
    class C00562 implements NestedScrollView.OnScrollChangeListener {
        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        /* JADX INFO: renamed from: a */
        public final void mo254a(NestedScrollView nestedScrollView) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$3 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC00573 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$5 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC00595 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class AlertParams {

        /* JADX INFO: renamed from: A */
        public int f333A;

        /* JADX INFO: renamed from: B */
        public int f334B;

        /* JADX INFO: renamed from: C */
        public int f335C;

        /* JADX INFO: renamed from: E */
        public boolean[] f337E;

        /* JADX INFO: renamed from: F */
        public boolean f338F;

        /* JADX INFO: renamed from: G */
        public boolean f339G;

        /* JADX INFO: renamed from: I */
        public DialogInterface.OnMultiChoiceClickListener f341I;

        /* JADX INFO: renamed from: J */
        public Cursor f342J;

        /* JADX INFO: renamed from: K */
        public String f343K;

        /* JADX INFO: renamed from: L */
        public String f344L;

        /* JADX INFO: renamed from: M */
        public AdapterView.OnItemSelectedListener f345M;

        /* JADX INFO: renamed from: a */
        public final ContextThemeWrapper f346a;

        /* JADX INFO: renamed from: b */
        public final LayoutInflater f347b;

        /* JADX INFO: renamed from: d */
        public Drawable f349d;

        /* JADX INFO: renamed from: e */
        public CharSequence f350e;

        /* JADX INFO: renamed from: f */
        public View f351f;

        /* JADX INFO: renamed from: g */
        public CharSequence f352g;

        /* JADX INFO: renamed from: h */
        public CharSequence f353h;

        /* JADX INFO: renamed from: i */
        public Drawable f354i;

        /* JADX INFO: renamed from: j */
        public DialogInterface.OnClickListener f355j;

        /* JADX INFO: renamed from: k */
        public CharSequence f356k;

        /* JADX INFO: renamed from: l */
        public Drawable f357l;

        /* JADX INFO: renamed from: m */
        public DialogInterface.OnClickListener f358m;

        /* JADX INFO: renamed from: n */
        public CharSequence f359n;

        /* JADX INFO: renamed from: o */
        public Drawable f360o;

        /* JADX INFO: renamed from: p */
        public DialogInterface.OnClickListener f361p;

        /* JADX INFO: renamed from: r */
        public DialogInterface.OnCancelListener f363r;

        /* JADX INFO: renamed from: s */
        public DialogInterface.OnDismissListener f364s;

        /* JADX INFO: renamed from: t */
        public DialogInterface.OnKeyListener f365t;

        /* JADX INFO: renamed from: u */
        public CharSequence[] f366u;

        /* JADX INFO: renamed from: v */
        public ListAdapter f367v;

        /* JADX INFO: renamed from: w */
        public DialogInterface.OnClickListener f368w;

        /* JADX INFO: renamed from: x */
        public int f369x;

        /* JADX INFO: renamed from: y */
        public View f370y;

        /* JADX INFO: renamed from: z */
        public int f371z;

        /* JADX INFO: renamed from: c */
        public int f348c = 0;

        /* JADX INFO: renamed from: D */
        public boolean f336D = false;

        /* JADX INFO: renamed from: H */
        public int f340H = -1;

        /* JADX INFO: renamed from: q */
        public boolean f362q = true;

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$AlertParams$1 */
        /* JADX INFO: compiled from: Proguard */
        class C00601 extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ RecycleListView f372a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00601(ContextThemeWrapper contextThemeWrapper, int i, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(contextThemeWrapper, i, R.id.text1, charSequenceArr);
                this.f372a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public final View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = AlertParams.this.f337E;
                if (zArr != null && zArr[i]) {
                    this.f372a.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$AlertParams$2 */
        /* JADX INFO: compiled from: Proguard */
        class C00612 extends CursorAdapter {

            /* JADX INFO: renamed from: a */
            public final int f374a;

            /* JADX INFO: renamed from: b */
            public final int f375b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ RecycleListView f376c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ AlertController f377d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00612(ContextThemeWrapper contextThemeWrapper, Cursor cursor, RecycleListView recycleListView, AlertController alertController) {
                super((Context) contextThemeWrapper, cursor, false);
                this.f376c = recycleListView;
                this.f377d = alertController;
                Cursor cursor2 = getCursor();
                this.f374a = cursor2.getColumnIndexOrThrow(AlertParams.this.f343K);
                this.f375b = cursor2.getColumnIndexOrThrow(AlertParams.this.f344L);
            }

            @Override // android.widget.CursorAdapter
            public final void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f374a));
                this.f376c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f375b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return AlertParams.this.f347b.inflate(this.f377d.f300L, viewGroup, false);
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$AlertParams$3 */
        /* JADX INFO: compiled from: Proguard */
        class C00623 implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AlertController f379a;

            public C00623(AlertController alertController) {
                this.f379a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                AlertParams alertParams = AlertParams.this;
                DialogInterface.OnClickListener onClickListener = alertParams.f368w;
                AlertController alertController = this.f379a;
                onClickListener.onClick(alertController.f307b, i);
                if (alertParams.f339G) {
                    return;
                }
                alertController.f307b.dismiss();
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$AlertParams$4 */
        /* JADX INFO: compiled from: Proguard */
        class C00634 implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ RecycleListView f381a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AlertController f382b;

            public C00634(RecycleListView recycleListView, AlertController alertController) {
                this.f381a = recycleListView;
                this.f382b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                AlertParams alertParams = AlertParams.this;
                boolean[] zArr = alertParams.f337E;
                RecycleListView recycleListView = this.f381a;
                if (zArr != null) {
                    zArr[i] = recycleListView.isItemChecked(i);
                }
                alertParams.f341I.onClick(this.f382b.f307b, i, recycleListView.isItemChecked(i));
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public interface OnPrepareListViewListener {
        }

        public AlertParams(ContextThemeWrapper contextThemeWrapper) {
            this.f346a = contextThemeWrapper;
            this.f347b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ButtonHandler extends Handler {

        /* JADX INFO: renamed from: a */
        public WeakReference f384a;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f384a.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CheckedItemAdapter extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a */
        public final int f385a;

        /* JADX INFO: renamed from: b */
        public final int f386b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.f282u);
            this.f386b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f385a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public AlertController(Context context, AlertDialog alertDialog, Window window) {
        this.f306a = context;
        this.f307b = alertDialog;
        this.f308c = window;
        ButtonHandler buttonHandler = new ButtonHandler();
        buttonHandler.f384a = new WeakReference(alertDialog);
        this.f304P = buttonHandler;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, androidx.appcompat.R.styleable.f266e, com.exchange.allin.R.attr.alertDialogStyle, 0);
        this.f298J = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f299K = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f300L = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f301M = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f302N = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f303O = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f309d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        alertDialog.supportRequestWindowFeature(1);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m251a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m251a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static ViewGroup m252b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: renamed from: c */
    public final void m253c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Drawable drawable) {
        Message messageObtainMessage = onClickListener != null ? this.f304P.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f329x = charSequence;
            this.f330y = messageObtainMessage;
            this.f331z = drawable;
        } else if (i == -2) {
            this.f325t = charSequence;
            this.f326u = messageObtainMessage;
            this.f327v = drawable;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f321p = charSequence;
            this.f322q = messageObtainMessage;
            this.f323r = drawable;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$4 */
    /* JADX INFO: compiled from: Proguard */
    class C00584 implements AbsListView.OnScrollListener {
        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
            throw null;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }
}
