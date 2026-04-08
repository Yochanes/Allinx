package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TintTypedArray;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class ListMenuItemView extends LinearLayout implements MenuView.ItemView, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a */
    public MenuItemImpl f805a;

    /* JADX INFO: renamed from: b */
    public ImageView f806b;

    /* JADX INFO: renamed from: c */
    public RadioButton f807c;

    /* JADX INFO: renamed from: d */
    public TextView f808d;

    /* JADX INFO: renamed from: f */
    public CheckBox f809f;

    /* JADX INFO: renamed from: g */
    public TextView f810g;

    /* JADX INFO: renamed from: i */
    public ImageView f811i;

    /* JADX INFO: renamed from: j */
    public ImageView f812j;

    /* JADX INFO: renamed from: n */
    public LinearLayout f813n;

    /* JADX INFO: renamed from: o */
    public final Drawable f814o;

    /* JADX INFO: renamed from: p */
    public final int f815p;

    /* JADX INFO: renamed from: q */
    public final Context f816q;

    /* JADX INFO: renamed from: r */
    public boolean f817r;

    /* JADX INFO: renamed from: s */
    public final Drawable f818s;

    /* JADX INFO: renamed from: t */
    public final boolean f819t;

    /* JADX INFO: renamed from: u */
    public LayoutInflater f820u;

    /* JADX INFO: renamed from: v */
    public boolean f821v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray tintTypedArrayM704f = TintTypedArray.m704f(getContext(), attributeSet, R.styleable.f280s, com.exchange.allin.R.attr.listMenuViewStyle, 0);
        this.f814o = tintTypedArrayM704f.m706b(5);
        TypedArray typedArray = tintTypedArrayM704f.f1413b;
        this.f815p = typedArray.getResourceId(1, -1);
        this.f817r = typedArray.getBoolean(7, false);
        this.f816q = context;
        this.f818s = tintTypedArrayM704f.m706b(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, com.exchange.allin.R.attr.dropDownListViewStyle, 0);
        this.f819t = typedArrayObtainStyledAttributes.hasValue(0);
        tintTypedArrayM704f.m709g();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f820u == null) {
            this.f820u = LayoutInflater.from(getContext());
        }
        return this.f820u;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f811i;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f812j;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f812j.getLayoutParams();
        rect.top = this.f812j.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.f805a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void initialize(MenuItemImpl menuItemImpl, int i) {
        boolean z2;
        int i2;
        String string;
        boolean z3;
        this.f805a = menuItemImpl;
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setTitle(menuItemImpl.f847e);
        setCheckable(menuItemImpl.isCheckable());
        if (menuItemImpl.f856n.isShortcutsVisible()) {
            if ((menuItemImpl.f856n.isQwertyMode() ? menuItemImpl.f852j : menuItemImpl.f850h) != 0) {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        menuItemImpl.f856n.isQwertyMode();
        if (z2) {
            MenuItemImpl menuItemImpl2 = this.f805a;
            if (menuItemImpl2.f856n.isShortcutsVisible()) {
                if ((menuItemImpl2.f856n.isQwertyMode() ? menuItemImpl2.f852j : menuItemImpl2.f850h) != 0) {
                    z3 = true;
                }
                if (z3) {
                }
            } else {
                z3 = false;
                i2 = z3 ? 0 : 8;
            }
        }
        if (i2 == 0) {
            TextView textView = this.f810g;
            MenuItemImpl menuItemImpl3 = this.f805a;
            char c2 = menuItemImpl3.f856n.isQwertyMode() ? menuItemImpl3.f852j : menuItemImpl3.f850h;
            if (c2 == 0) {
                string = "";
            } else {
                MenuBuilder menuBuilder = menuItemImpl3.f856n;
                Resources resources = menuBuilder.getContext().getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(menuBuilder.getContext()).hasPermanentMenuKey()) {
                    sb.append(resources.getString(com.exchange.allin.R.string.abc_prepend_shortcut_label));
                }
                int i3 = menuBuilder.isQwertyMode() ? menuItemImpl3.f853k : menuItemImpl3.f851i;
                MenuItemImpl.m471c(i3, 65536, resources.getString(com.exchange.allin.R.string.abc_menu_meta_shortcut_label), sb);
                MenuItemImpl.m471c(i3, 4096, resources.getString(com.exchange.allin.R.string.abc_menu_ctrl_shortcut_label), sb);
                MenuItemImpl.m471c(i3, 2, resources.getString(com.exchange.allin.R.string.abc_menu_alt_shortcut_label), sb);
                MenuItemImpl.m471c(i3, 1, resources.getString(com.exchange.allin.R.string.abc_menu_shift_shortcut_label), sb);
                MenuItemImpl.m471c(i3, 4, resources.getString(com.exchange.allin.R.string.abc_menu_sym_shortcut_label), sb);
                MenuItemImpl.m471c(i3, 8, resources.getString(com.exchange.allin.R.string.abc_menu_function_shortcut_label), sb);
                if (c2 == '\b') {
                    sb.append(resources.getString(com.exchange.allin.R.string.abc_menu_delete_shortcut_label));
                } else if (c2 == '\n') {
                    sb.append(resources.getString(com.exchange.allin.R.string.abc_menu_enter_shortcut_label));
                } else if (c2 != ' ') {
                    sb.append(c2);
                } else {
                    sb.append(resources.getString(com.exchange.allin.R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f810g.getVisibility() != i2) {
            this.f810g.setVisibility(i2);
        }
        setIcon(menuItemImpl.getIcon());
        setEnabled(menuItemImpl.isEnabled());
        setSubMenuArrowVisible(menuItemImpl.hasSubMenu());
        setContentDescription(menuItemImpl.f859q);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f814o);
        TextView textView = (TextView) findViewById(com.exchange.allin.R.id.title);
        this.f808d = textView;
        int i = this.f815p;
        if (i != -1) {
            textView.setTextAppearance(this.f816q, i);
        }
        this.f810g = (TextView) findViewById(com.exchange.allin.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(com.exchange.allin.R.id.submenuarrow);
        this.f811i = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f818s);
        }
        this.f812j = (ImageView) findViewById(com.exchange.allin.R.id.group_divider);
        this.f813n = (LinearLayout) findViewById(com.exchange.allin.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f806b != null && this.f817r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f806b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f807c == null && this.f809f == null) {
            return;
        }
        if ((this.f805a.f866x & 4) != 0) {
            if (this.f807c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.exchange.allin.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f807c = radioButton;
                LinearLayout linearLayout = this.f813n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f807c;
            view = this.f809f;
        } else {
            if (this.f809f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.exchange.allin.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f809f = checkBox;
                LinearLayout linearLayout2 = this.f813n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f809f;
            view = this.f807c;
        }
        if (z2) {
            compoundButton.setChecked(this.f805a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f809f;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f807c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f805a.f866x & 4) != 0) {
            if (this.f807c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.exchange.allin.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f807c = radioButton;
                LinearLayout linearLayout = this.f813n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f807c;
        } else {
            if (this.f809f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.exchange.allin.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f809f = checkBox;
                LinearLayout linearLayout2 = this.f813n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f809f;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f821v = z2;
        this.f817r = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f812j;
        if (imageView != null) {
            imageView.setVisibility((this.f819t || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z2 = this.f805a.f856n.getOptionalIconsVisible() || this.f821v;
        if (z2 || this.f817r) {
            ImageView imageView = this.f806b;
            if (imageView == null && drawable == null && !this.f817r) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(com.exchange.allin.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f806b = imageView2;
                LinearLayout linearLayout = this.f813n;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f817r) {
                this.f806b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f806b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f806b.getVisibility() != 0) {
                this.f806b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f808d.getVisibility() != 8) {
                this.f808d.setVisibility(8);
            }
        } else {
            this.f808d.setText(charSequence);
            if (this.f808d.getVisibility() != 0) {
                this.f808d.setVisibility(0);
            }
        }
    }
}
