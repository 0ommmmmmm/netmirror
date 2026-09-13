package U1;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC0393g;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.U;

/* JADX INFO: loaded from: classes.dex */
public class i extends AbstractC0393g {
    public i(BaseViewManager<Object, ? extends U> baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC0393g, com.facebook.react.uimanager.Q0
    public void a(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeValue")) {
            ((j) this.f7478a).setNativeValue(view, readableArray.getBoolean(0));
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC0393g, com.facebook.react.uimanager.Q0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "thumbColor":
                ((j) this.f7478a).setThumbColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "enabled":
                ((j) this.f7478a).setEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "trackTintColor":
                ((j) this.f7478a).setTrackTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "on":
                ((j) this.f7478a).setOn(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "value":
                ((j) this.f7478a).setValue(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "disabled":
                ((j) this.f7478a).setDisabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "trackColorForFalse":
                ((j) this.f7478a).setTrackColorForFalse(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "thumbTintColor":
                ((j) this.f7478a).setThumbTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "trackColorForTrue":
                ((j) this.f7478a).setTrackColorForTrue(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
