package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayoutStates {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f22703a;

    /* JADX INFO: renamed from: b */
    public int f22704b = -1;

    /* JADX INFO: renamed from: c */
    public int f22705c = -1;

    /* JADX INFO: renamed from: d */
    public final SparseArray f22706d = new SparseArray();

    /* JADX INFO: renamed from: e */
    public final SparseArray f22707e = new SparseArray();

    /* JADX INFO: compiled from: Proguard */
    public static class State {

        /* JADX INFO: renamed from: a */
        public final int f22708a;

        /* JADX INFO: renamed from: b */
        public final ArrayList f22709b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final int f22710c;

        /* JADX INFO: renamed from: d */
        public final ConstraintSet f22711d;

        public State(Context context, XmlResourceParser xmlResourceParser) {
            this.f22710c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.f22886r);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f22708a = typedArrayObtainStyledAttributes.getResourceId(index, this.f22708a);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f22710c);
                    this.f22710c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f22711d = constraintSet;
                        constraintSet.m7351f((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Variant {

        /* JADX INFO: renamed from: a */
        public final float f22712a;

        /* JADX INFO: renamed from: b */
        public final float f22713b;

        /* JADX INFO: renamed from: c */
        public final float f22714c;

        /* JADX INFO: renamed from: d */
        public final float f22715d;

        /* JADX INFO: renamed from: e */
        public final int f22716e;

        /* JADX INFO: renamed from: f */
        public final ConstraintSet f22717f;

        public Variant(Context context, XmlResourceParser xmlResourceParser) {
            this.f22712a = Float.NaN;
            this.f22713b = Float.NaN;
            this.f22714c = Float.NaN;
            this.f22715d = Float.NaN;
            this.f22716e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.f22890v);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f22716e);
                    this.f22716e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f22717f = constraintSet;
                        constraintSet.m7351f((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f22715d = typedArrayObtainStyledAttributes.getDimension(index, this.f22715d);
                } else if (index == 2) {
                    this.f22713b = typedArrayObtainStyledAttributes.getDimension(index, this.f22713b);
                } else if (index == 3) {
                    this.f22714c = typedArrayObtainStyledAttributes.getDimension(index, this.f22714c);
                } else if (index == 4) {
                    this.f22712a = typedArrayObtainStyledAttributes.getDimension(index, this.f22712a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m7339a(float f, float f2) {
            float f3 = this.f22712a;
            if (!Float.isNaN(f3) && f < f3) {
                return false;
            }
            float f4 = this.f22713b;
            if (!Float.isNaN(f4) && f2 < f4) {
                return false;
            }
            float f5 = this.f22714c;
            if (!Float.isNaN(f5) && f > f5) {
                return false;
            }
            float f6 = this.f22715d;
            return Float.isNaN(f6) || f2 <= f6;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i) {
        State state = null;
        this.f22703a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            while (true) {
                byte b2 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            b2 = !name.equals("ConstraintSet") ? (byte) -1 : (byte) 4;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b2 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b2 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b2 = 3;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    if (b2 == 2) {
                        state = new State(context, xml);
                        this.f22706d.put(state.f22708a, state);
                    } else if (b2 == 3) {
                        Variant variant = new Variant(context, xml);
                        if (state != null) {
                            state.f22709b.add(variant);
                        }
                    } else if (b2 == 4) {
                        m7337a(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7337a(Context context, XmlResourceParser xmlResourceParser) {
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains(RemoteSettings.FORWARD_SLASH_STRING) ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                constraintSet.m7355l(context, xmlResourceParser);
                this.f22707e.put(identifier, constraintSet);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7338b(float f, float f2, int i) {
        int i2 = this.f22704b;
        SparseArray sparseArray = this.f22706d;
        int i3 = 0;
        ConstraintLayout constraintLayout = this.f22703a;
        if (i2 == i) {
            State state = i == -1 ? (State) sparseArray.valueAt(0) : (State) sparseArray.get(i2);
            int i4 = this.f22705c;
            if (i4 == -1 || !((Variant) state.f22709b.get(i4)).m7339a(f, f2)) {
                while (true) {
                    ArrayList arrayList = state.f22709b;
                    if (i3 >= arrayList.size()) {
                        i3 = -1;
                        break;
                    } else if (((Variant) arrayList.get(i3)).m7339a(f, f2)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (this.f22705c == i3) {
                    return;
                }
                ArrayList arrayList2 = state.f22709b;
                ConstraintSet constraintSet = i3 == -1 ? null : ((Variant) arrayList2.get(i3)).f22717f;
                if (i3 != -1) {
                    int i5 = ((Variant) arrayList2.get(i3)).f22716e;
                }
                if (constraintSet == null) {
                    return;
                }
                this.f22705c = i3;
                constraintSet.m7349c(constraintLayout);
                return;
            }
            return;
        }
        this.f22704b = i;
        State state2 = (State) sparseArray.get(i);
        while (true) {
            ArrayList arrayList3 = state2.f22709b;
            if (i3 >= arrayList3.size()) {
                i3 = -1;
                break;
            } else if (((Variant) arrayList3.get(i3)).m7339a(f, f2)) {
                break;
            } else {
                i3++;
            }
        }
        ArrayList arrayList4 = state2.f22709b;
        ConstraintSet constraintSet2 = i3 == -1 ? state2.f22711d : ((Variant) arrayList4.get(i3)).f22717f;
        if (i3 != -1) {
            int i6 = ((Variant) arrayList4.get(i3)).f22716e;
        }
        if (constraintSet2 != null) {
            this.f22705c = i3;
            constraintSet2.m7349c(constraintLayout);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
    }
}
