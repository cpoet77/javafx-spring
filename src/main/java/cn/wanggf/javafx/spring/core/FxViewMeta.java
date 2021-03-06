package cn.wanggf.javafx.spring.core;

/**
 * 视图元信息
 *
 * @author wanggf
 */
public class FxViewMeta {
    /**
     * 视图名称
     */
    private String name;

    /**
     * 视图路径
     */
    private String path;

    /**
     * 原生视图对象
     */
    private Object originView;

    FxViewMeta() {
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public Object getOriginView() {
        return originView;
    }

    void setOriginView(Object originView) {
        this.originView = originView;
    }
}
