package com.google.zxing.client.android.camera;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@TargetApi(15)
public final class CameraConfigurationUtils {
    private static final int AREA_PER_1000 = 400;
    private static final double MAX_ASPECT_DISTORTION = 0.15d;
    private static final float MAX_EXPOSURE_COMPENSATION = 1.5f;
    private static final int MAX_FPS = 20;
    private static final float MIN_EXPOSURE_COMPENSATION = 0.0f;
    private static final int MIN_FPS = 10;
    private static final int MIN_PREVIEW_PIXELS = 153600;
    private static final Pattern SEMICOLON = Pattern.compile(";");
    private static final String TAG = "CameraConfiguration";

    /* JADX INFO: renamed from: com.google.zxing.client.android.camera.CameraConfigurationUtils$1 */
    /* JADX INFO: compiled from: Proguard */
    public static class C49471 implements Comparator<Camera.Size> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Camera.Size size, Camera.Size size2) {
            return compare2(size, size2);
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(Camera.Size size, Camera.Size size2) {
            int i = size.height * size.width;
            int i2 = size2.height * size2.width;
            if (i2 < i) {
                return -1;
            }
            return i2 > i ? 1 : 0;
        }
    }

    private CameraConfigurationUtils() {
    }

    private static List<Camera.Area> buildMiddleArea(int i) {
        int i2 = -i;
        return Collections.singletonList(new Camera.Area(new Rect(i2, i2, i, i), 1));
    }

    public static String collectStats(Camera.Parameters parameters) {
        return collectStats(parameters.flatten());
    }

    public static Point findBestPreviewSizeValue(Camera.Parameters parameters, Point point) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            Log.w(TAG, "Device returned no supported preview sizes; using default");
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                return new Point(previewSize.width, previewSize.height);
            }
            throw new IllegalStateException("Parameters contained no preview size!");
        }
        ArrayList<Camera.Size> arrayList = new ArrayList(supportedPreviewSizes);
        Collections.sort(arrayList, new C49471());
        if (Log.isLoggable(TAG, 4)) {
            StringBuilder sb = new StringBuilder();
            for (Camera.Size size : arrayList) {
                sb.append(size.width);
                sb.append('x');
                sb.append(size.height);
                sb.append(' ');
            }
            Log.i(TAG, "Supported preview sizes: " + ((Object) sb));
        }
        double d = ((double) point.x) / ((double) point.y);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (!arrayList.isEmpty()) {
                    Camera.Size size2 = (Camera.Size) arrayList.get(0);
                    Point point2 = new Point(size2.width, size2.height);
                    Log.i(TAG, "Using largest suitable preview size: " + point2);
                    return point2;
                }
                Camera.Size previewSize2 = parameters.getPreviewSize();
                if (previewSize2 == null) {
                    throw new IllegalStateException("Parameters contained no preview size!");
                }
                Point point3 = new Point(previewSize2.width, previewSize2.height);
                Log.i(TAG, "No suitable preview sizes, using default: " + point3);
                return point3;
            }
            Camera.Size size3 = (Camera.Size) it.next();
            int i = size3.width;
            int i2 = size3.height;
            if (i * i2 < MIN_PREVIEW_PIXELS) {
                it.remove();
            } else {
                boolean z2 = i < i2;
                int i3 = z2 ? i2 : i;
                int i4 = z2 ? i : i2;
                if (Math.abs((((double) i3) / ((double) i4)) - d) > MAX_ASPECT_DISTORTION) {
                    it.remove();
                } else if (i3 == point.x && i4 == point.y) {
                    Point point4 = new Point(i, i2);
                    Log.i(TAG, "Found preview size exactly matching screen size: " + point4);
                    return point4;
                }
            }
        }
    }

    private static String findSettableValue(String str, Collection<String> collection, String... strArr) {
        StringBuilder sbM23t = AbstractC0000a.m23t("Requesting ", str, " value from among: ");
        sbM23t.append(Arrays.toString(strArr));
        Log.i(TAG, sbM23t.toString());
        Log.i(TAG, "Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    Log.i(TAG, "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i(TAG, "No supported values match");
        return null;
    }

    private static Integer indexOfClosestZoom(Camera.Parameters parameters, double d) {
        List<Integer> zoomRatios = parameters.getZoomRatios();
        Log.i(TAG, "Zoom ratios: " + zoomRatios);
        int maxZoom = parameters.getMaxZoom();
        if (zoomRatios == null || zoomRatios.isEmpty() || zoomRatios.size() != maxZoom + 1) {
            Log.w(TAG, "Invalid zoom ratios!");
            return null;
        }
        double d2 = d * 100.0d;
        double d3 = Double.POSITIVE_INFINITY;
        int i = 0;
        for (int i2 = 0; i2 < zoomRatios.size(); i2++) {
            double dAbs = Math.abs(((double) zoomRatios.get(i2).intValue()) - d2);
            if (dAbs < d3) {
                i = i2;
                d3 = dAbs;
            }
        }
        Log.i(TAG, "Chose zoom ratio of " + (((double) zoomRatios.get(i).intValue()) / 100.0d));
        return Integer.valueOf(i);
    }

    public static void setBarcodeSceneMode(Camera.Parameters parameters) {
        if ("barcode".equals(parameters.getSceneMode())) {
            Log.i(TAG, "Barcode scene mode already set");
            return;
        }
        String strFindSettableValue = findSettableValue("scene mode", parameters.getSupportedSceneModes(), "barcode");
        if (strFindSettableValue != null) {
            parameters.setSceneMode(strFindSettableValue);
        }
    }

    public static void setBestExposure(Camera.Parameters parameters, boolean z2) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation != 0 || maxExposureCompensation != 0) {
            float f = MIN_EXPOSURE_COMPENSATION;
            if (exposureCompensationStep > MIN_EXPOSURE_COMPENSATION) {
                if (!z2) {
                    f = MAX_EXPOSURE_COMPENSATION;
                }
                int iRound = Math.round(f / exposureCompensationStep);
                float f2 = exposureCompensationStep * iRound;
                int iMax = Math.max(Math.min(iRound, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == iMax) {
                    Log.i(TAG, "Exposure compensation already set to " + iMax + " / " + f2);
                    return;
                }
                Log.i(TAG, "Setting exposure compensation to " + iMax + " / " + f2);
                parameters.setExposureCompensation(iMax);
                return;
            }
        }
        Log.i(TAG, "Camera does not support exposure compensation");
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters) {
        setBestPreviewFPS(parameters, 10, 20);
    }

    public static void setFocus(Camera.Parameters parameters, boolean z2, boolean z3, boolean z4) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String strFindSettableValue = z2 ? (z4 || z3) ? findSettableValue("focus mode", supportedFocusModes, "auto") : findSettableValue("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto") : null;
        if (!z4 && strFindSettableValue == null) {
            strFindSettableValue = findSettableValue("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (strFindSettableValue != null) {
            if (strFindSettableValue.equals(parameters.getFocusMode())) {
                Log.i(TAG, "Focus mode already set to ".concat(strFindSettableValue));
            } else {
                parameters.setFocusMode(strFindSettableValue);
            }
        }
    }

    public static void setFocusArea(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() <= 0) {
            Log.i(TAG, "Device does not support focus areas");
            return;
        }
        Log.i(TAG, "Old focus areas: " + toString((Iterable<Camera.Area>) parameters.getFocusAreas()));
        List<Camera.Area> listBuildMiddleArea = buildMiddleArea(400);
        Log.i(TAG, "Setting focus area to : " + toString((Iterable<Camera.Area>) listBuildMiddleArea));
        parameters.setFocusAreas(listBuildMiddleArea);
    }

    public static void setInvertColor(Camera.Parameters parameters) {
        if ("negative".equals(parameters.getColorEffect())) {
            Log.i(TAG, "Negative effect already set");
            return;
        }
        String strFindSettableValue = findSettableValue("color effect", parameters.getSupportedColorEffects(), "negative");
        if (strFindSettableValue != null) {
            parameters.setColorEffect(strFindSettableValue);
        }
    }

    public static void setMetering(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() <= 0) {
            Log.i(TAG, "Device does not support metering areas");
            return;
        }
        Log.i(TAG, "Old metering areas: " + parameters.getMeteringAreas());
        List<Camera.Area> listBuildMiddleArea = buildMiddleArea(400);
        Log.i(TAG, "Setting metering area to : " + toString((Iterable<Camera.Area>) listBuildMiddleArea));
        parameters.setMeteringAreas(listBuildMiddleArea);
    }

    public static void setTorch(Camera.Parameters parameters, boolean z2) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String strFindSettableValue = z2 ? findSettableValue("flash mode", supportedFlashModes, "torch", "on") : findSettableValue("flash mode", supportedFlashModes, "off");
        if (strFindSettableValue != null) {
            if (strFindSettableValue.equals(parameters.getFlashMode())) {
                Log.i(TAG, "Flash mode already set to ".concat(strFindSettableValue));
            } else {
                Log.i(TAG, "Setting flash mode to ".concat(strFindSettableValue));
                parameters.setFlashMode(strFindSettableValue);
            }
        }
    }

    public static void setVideoStabilization(Camera.Parameters parameters) {
        if (!parameters.isVideoStabilizationSupported()) {
            Log.i(TAG, "This device does not support video stabilization");
        } else if (parameters.getVideoStabilization()) {
            Log.i(TAG, "Video stabilization already enabled");
        } else {
            Log.i(TAG, "Enabling video stabilization...");
            parameters.setVideoStabilization(true);
        }
    }

    public static void setZoom(Camera.Parameters parameters, double d) {
        if (!parameters.isZoomSupported()) {
            Log.i(TAG, "Zoom is not supported");
            return;
        }
        Integer numIndexOfClosestZoom = indexOfClosestZoom(parameters, d);
        if (numIndexOfClosestZoom == null) {
            return;
        }
        if (parameters.getZoom() == numIndexOfClosestZoom.intValue()) {
            Log.i(TAG, "Zoom is already set to " + numIndexOfClosestZoom);
        } else {
            Log.i(TAG, "Setting zoom to " + numIndexOfClosestZoom);
            parameters.setZoom(numIndexOfClosestZoom.intValue());
        }
    }

    private static String toString(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static String collectStats(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(1000);
        sb.append("BOARD=");
        sb.append(Build.BOARD);
        sb.append("\nBRAND=");
        sb.append(Build.BRAND);
        sb.append("\nCPU_ABI=");
        sb.append(Build.CPU_ABI);
        sb.append("\nDEVICE=");
        sb.append(Build.DEVICE);
        sb.append("\nDISPLAY=");
        sb.append(Build.DISPLAY);
        sb.append("\nFINGERPRINT=");
        sb.append(Build.FINGERPRINT);
        sb.append("\nHOST=");
        sb.append(Build.HOST);
        sb.append("\nID=");
        sb.append(Build.ID);
        sb.append("\nMANUFACTURER=");
        sb.append(Build.MANUFACTURER);
        sb.append("\nMODEL=");
        sb.append(Build.MODEL);
        sb.append("\nPRODUCT=");
        sb.append(Build.PRODUCT);
        sb.append("\nTAGS=");
        sb.append(Build.TAGS);
        sb.append("\nTIME=");
        sb.append(Build.TIME);
        sb.append("\nTYPE=");
        sb.append(Build.TYPE);
        sb.append("\nUSER=");
        sb.append(Build.USER);
        sb.append("\nVERSION.CODENAME=");
        sb.append(Build.VERSION.CODENAME);
        sb.append("\nVERSION.INCREMENTAL=");
        sb.append(Build.VERSION.INCREMENTAL);
        sb.append("\nVERSION.RELEASE=");
        sb.append(Build.VERSION.RELEASE);
        sb.append("\nVERSION.SDK_INT=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append('\n');
        if (charSequence != null) {
            String[] strArrSplit = SEMICOLON.split(charSequence);
            Arrays.sort(strArrSplit);
            for (String str : strArrSplit) {
                sb.append(str);
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters, int i, int i2) {
        int[] next;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        Log.i(TAG, "Supported FPS ranges: " + toString((Collection<int[]>) supportedPreviewFpsRange));
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
            return;
        }
        Iterator<int[]> it = supportedPreviewFpsRange.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i3 = next[0];
            int i4 = next[1];
            if (i3 >= i * 1000 && i4 <= i2 * 1000) {
                break;
            }
        }
        if (next == null) {
            Log.i(TAG, "No suitable FPS range?");
            return;
        }
        int[] iArr = new int[2];
        parameters.getPreviewFpsRange(iArr);
        if (Arrays.equals(iArr, next)) {
            Log.i(TAG, "FPS range already set to " + Arrays.toString(next));
        } else {
            Log.i(TAG, "Setting FPS range to " + Arrays.toString(next));
            parameters.setPreviewFpsRange(next[0], next[1]);
        }
    }

    private static String toString(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Camera.Area area : iterable) {
            sb.append(area.rect);
            sb.append(':');
            sb.append(area.weight);
            sb.append(' ');
        }
        return sb.toString();
    }
}
