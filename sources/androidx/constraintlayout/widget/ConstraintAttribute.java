package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintAttribute {

    /* JADX INFO: renamed from: a */
    public boolean f22598a = false;

    /* JADX INFO: renamed from: b */
    public String f22599b;

    /* JADX INFO: renamed from: c */
    public AttributeType f22600c;

    /* JADX INFO: renamed from: d */
    public int f22601d;

    /* JADX INFO: renamed from: e */
    public float f22602e;

    /* JADX INFO: renamed from: f */
    public String f22603f;

    /* JADX INFO: renamed from: g */
    public boolean f22604g;

    /* JADX INFO: renamed from: h */
    public int f22605h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class AttributeType {

        /* JADX INFO: renamed from: a */
        public static final AttributeType f22606a;

        /* JADX INFO: renamed from: b */
        public static final AttributeType f22607b;

        /* JADX INFO: renamed from: c */
        public static final AttributeType f22608c;

        /* JADX INFO: renamed from: d */
        public static final AttributeType f22609d;

        /* JADX INFO: renamed from: f */
        public static final AttributeType f22610f;

        /* JADX INFO: renamed from: g */
        public static final AttributeType f22611g;

        /* JADX INFO: renamed from: i */
        public static final AttributeType f22612i;

        /* JADX INFO: renamed from: j */
        public static final AttributeType f22613j;

        /* JADX INFO: renamed from: n */
        public static final /* synthetic */ AttributeType[] f22614n;

        static {
            AttributeType attributeType = new AttributeType("INT_TYPE", 0);
            f22606a = attributeType;
            AttributeType attributeType2 = new AttributeType("FLOAT_TYPE", 1);
            f22607b = attributeType2;
            AttributeType attributeType3 = new AttributeType("COLOR_TYPE", 2);
            f22608c = attributeType3;
            AttributeType attributeType4 = new AttributeType("COLOR_DRAWABLE_TYPE", 3);
            f22609d = attributeType4;
            AttributeType attributeType5 = new AttributeType("STRING_TYPE", 4);
            f22610f = attributeType5;
            AttributeType attributeType6 = new AttributeType("BOOLEAN_TYPE", 5);
            f22611g = attributeType6;
            AttributeType attributeType7 = new AttributeType("DIMENSION_TYPE", 6);
            f22612i = attributeType7;
            AttributeType attributeType8 = new AttributeType("REFERENCE_TYPE", 7);
            f22613j = attributeType8;
            f22614n = new AttributeType[]{attributeType, attributeType2, attributeType3, attributeType4, attributeType5, attributeType6, attributeType7, attributeType8};
        }

        public static AttributeType valueOf(String str) {
            return (AttributeType) Enum.valueOf(AttributeType.class, str);
        }

        public static AttributeType[] values() {
            return (AttributeType[]) f22614n.clone();
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f22599b = constraintAttribute.f22599b;
        this.f22600c = constraintAttribute.f22600c;
        m7321f(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m7316d(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        AttributeType attributeType;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.f22873e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        AttributeType attributeType2 = null;
        boolean z2 = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z2 = true;
            } else if (index == 1) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.f22611g;
            } else {
                if (index == 3) {
                    attributeType = AttributeType.f22608c;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    attributeType = AttributeType.f22609d;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    AttributeType attributeType3 = AttributeType.f22612i;
                    if (index == 7) {
                        objValueOf2 = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                    } else if (index == 4) {
                        objValueOf2 = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                    } else if (index == 5) {
                        attributeType = AttributeType.f22607b;
                        objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    } else if (index == 6) {
                        attributeType = AttributeType.f22606a;
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    } else if (index == 9) {
                        attributeType = AttributeType.f22610f;
                        objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    } else if (index == 8) {
                        attributeType = AttributeType.f22613j;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        if (resourceId == -1) {
                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        objValueOf = Integer.valueOf(resourceId);
                    }
                    attributeType2 = attributeType3;
                }
                Object obj = objValueOf;
                attributeType2 = attributeType;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            ConstraintAttribute constraintAttribute = new ConstraintAttribute();
            constraintAttribute.f22599b = string;
            constraintAttribute.f22600c = attributeType2;
            constraintAttribute.f22598a = z2;
            constraintAttribute.m7321f(objValueOf2);
            map.put(string, constraintAttribute);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: e */
    public static void m7317e(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            ConstraintAttribute constraintAttribute = (ConstraintAttribute) map.get(str);
            String strM13j = !constraintAttribute.f22598a ? AbstractC0000a.m13j("set", str) : str;
            try {
                int iOrdinal = constraintAttribute.f22600c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(strM13j, cls3).invoke(view, Integer.valueOf(constraintAttribute.f22601d));
                        break;
                    case 1:
                        cls.getMethod(strM13j, cls2).invoke(view, Float.valueOf(constraintAttribute.f22602e));
                        break;
                    case 2:
                        cls.getMethod(strM13j, cls3).invoke(view, Integer.valueOf(constraintAttribute.f22605h));
                        break;
                    case 3:
                        Method method = cls.getMethod(strM13j, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f22605h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(strM13j, CharSequence.class).invoke(view, constraintAttribute.f22603f);
                        break;
                    case 5:
                        cls.getMethod(strM13j, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f22604g));
                        break;
                    case 6:
                        cls.getMethod(strM13j, cls2).invoke(view, Float.valueOf(constraintAttribute.f22602e));
                        break;
                    case 7:
                        cls.getMethod(strM13j, cls3).invoke(view, Integer.valueOf(constraintAttribute.f22601d));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder sbM23t = AbstractC0000a.m23t(" Custom Attribute \"", str, "\" not found on ");
                sbM23t.append(cls.getName());
                Log.e("TransitionLayout", sbM23t.toString(), e);
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + strM13j, e2);
            } catch (InvocationTargetException e3) {
                StringBuilder sbM23t2 = AbstractC0000a.m23t(" Custom Attribute \"", str, "\" not found on ");
                sbM23t2.append(cls.getName());
                Log.e("TransitionLayout", sbM23t2.toString(), e3);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final float m7318a() {
        switch (this.f22600c.ordinal()) {
            case 0:
                return this.f22601d;
            case 1:
            case 6:
                return this.f22602e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.f22604g ? 1.0f : 0.0f;
            default:
                return Float.NaN;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7319b(float[] fArr) {
        switch (this.f22600c.ordinal()) {
            case 0:
                fArr[0] = this.f22601d;
                return;
            case 1:
                fArr[0] = this.f22602e;
                return;
            case 2:
            case 3:
                int i = (this.f22605h >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.f22604g ? 1.0f : 0.0f;
                return;
            case 6:
                fArr[0] = this.f22602e;
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m7320c() {
        int iOrdinal = this.f22600c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    /* JADX INFO: renamed from: f */
    public final void m7321f(Object obj) {
        switch (this.f22600c.ordinal()) {
            case 0:
            case 7:
                this.f22601d = ((Integer) obj).intValue();
                break;
            case 1:
                this.f22602e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f22605h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f22603f = (String) obj;
                break;
            case 5:
                this.f22604g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f22602e = ((Float) obj).floatValue();
                break;
        }
    }
}
