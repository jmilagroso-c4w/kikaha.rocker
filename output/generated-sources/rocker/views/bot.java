package views;

import java.io.IOException;
import com.fizzed.rocker.ForIterator;
import com.fizzed.rocker.RenderingException;
import com.fizzed.rocker.RockerContent;
import com.fizzed.rocker.RockerOutput;
import com.fizzed.rocker.runtime.DefaultRockerTemplate;
import com.fizzed.rocker.runtime.PlainTextUnloadedClassLoader;
// import @ [1:1]
import myapp.models.Forum;;
// import @ [2:1]
import myapp.models.Post;;

/*
 * Auto generated code to render template views/bot.rocker.html
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
public class bot extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public final com.fizzed.rocker.ContentType CONTENT_TYPE = com.fizzed.rocker.ContentType.HTML;
    static public final String TEMPLATE_NAME = "bot.rocker.html";
    static public final String TEMPLATE_PACKAGE_NAME = "views";
    static public final String HEADER_HASH = "-2106852055";
    static public final long MODIFIED_AT = 1494232322000L;
    static public final String[] ARGUMENT_NAMES = { "forum" };

    // argument @ [4:2]
    private Forum forum;

    public bot forum(Forum forum) {
        this.forum = forum;
        return this;
    }

    public Forum forum() {
        return this.forum;
    }

    static public bot template(Forum forum) {
        return new bot()
            .forum(forum);
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for convenience (runtime auto reloading enabled if rocker.reloading=true)
        return com.fizzed.rocker.runtime.RockerRuntime.getInstance().getBootstrap().template(this.getClass(), this);
    }

    static public class Template extends com.fizzed.rocker.runtime.DefaultRockerTemplate {

        //     <div class=\"page-header\">\n        <h1>\n            
        static private final byte[] PLAIN_TEXT_0_0;
        // <br>\n            
        static private final byte[] PLAIN_TEXT_1_0;
        // <br>\n            Posts\n        </h1>\n    </div>\n    <ul class=\"list-group\">\n
        static private final byte[] PLAIN_TEXT_2_0;
        //             <li class=\"list-group-item\">\n                Title: <b>
        static private final byte[] PLAIN_TEXT_3_0;
        // </b>\n                <br>\n                Body: 
        static private final byte[] PLAIN_TEXT_4_0;
        // \n                <br>\n                <img src=\"
        static private final byte[] PLAIN_TEXT_5_0;
        // \" class=\"thumbnail\" style=\"width: 140px; height: 140px;\">\n                <br>\n                Created At: 
        static private final byte[] PLAIN_TEXT_6_0;
        // \n\n                <br>\n                <br>\n                Author Name: 
        static private final byte[] PLAIN_TEXT_7_0;
        // \n                <br>\n                Role: 
        static private final byte[] PLAIN_TEXT_8_0;
        // \n                <br>\n                Place: 
        static private final byte[] PLAIN_TEXT_9_0;
        // \" class=\"img-circle\" style=\"width: 140px; height: 140px;\">\n            </li>\n
        static private final byte[] PLAIN_TEXT_10_0;
        //     </ul>\n\n
        static private final byte[] PLAIN_TEXT_11_0;
        //     <ul class=\"pagination\">\n
        static private final byte[] PLAIN_TEXT_12_0;
        //         <li><a href=\"/
        static private final byte[] PLAIN_TEXT_13_0;
        // /1\">&laquo;</a></li>\n
        static private final byte[] PLAIN_TEXT_14_0;
        // \n
        static private final byte[] PLAIN_TEXT_15_0;
        //                 i = +forum.page - 4\n
        static private final byte[] PLAIN_TEXT_16_0;
        //             <li class=\"disabled\"><a href=\"#\">...</a></li>\n
        static private final byte[] PLAIN_TEXT_17_0;
        //                 <li class=\"active\"><span> 
        static private final byte[] PLAIN_TEXT_18_0;
        //  <span class=\"sr-only\">(current)</span></span></li>\n
        static private final byte[] PLAIN_TEXT_19_0;
        //                 <li><a href=\"/
        static private final byte[] PLAIN_TEXT_20_0;
        // /
        static private final byte[] PLAIN_TEXT_21_0;
        // \"> 
        static private final byte[] PLAIN_TEXT_22_0;
        //  </a></li>\n
        static private final byte[] PLAIN_TEXT_23_0;
        //                 <li class=\"disabled\"><a href=\"#\">...</a></li>\n                break;\n
        static private final byte[] PLAIN_TEXT_24_0;
        //             <li><a href=\"/
        static private final byte[] PLAIN_TEXT_25_0;
        //  \">&raquo;</a></li>\n
        static private final byte[] PLAIN_TEXT_26_0;
        //     </ul>\n
        static private final byte[] PLAIN_TEXT_27_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(bot.class.getClassLoader(), bot.class.getName() + "$PlainText", "UTF-8");
            PLAIN_TEXT_0_0 = loader.tryGet("PLAIN_TEXT_0_0");
            PLAIN_TEXT_1_0 = loader.tryGet("PLAIN_TEXT_1_0");
            PLAIN_TEXT_2_0 = loader.tryGet("PLAIN_TEXT_2_0");
            PLAIN_TEXT_3_0 = loader.tryGet("PLAIN_TEXT_3_0");
            PLAIN_TEXT_4_0 = loader.tryGet("PLAIN_TEXT_4_0");
            PLAIN_TEXT_5_0 = loader.tryGet("PLAIN_TEXT_5_0");
            PLAIN_TEXT_6_0 = loader.tryGet("PLAIN_TEXT_6_0");
            PLAIN_TEXT_7_0 = loader.tryGet("PLAIN_TEXT_7_0");
            PLAIN_TEXT_8_0 = loader.tryGet("PLAIN_TEXT_8_0");
            PLAIN_TEXT_9_0 = loader.tryGet("PLAIN_TEXT_9_0");
            PLAIN_TEXT_10_0 = loader.tryGet("PLAIN_TEXT_10_0");
            PLAIN_TEXT_11_0 = loader.tryGet("PLAIN_TEXT_11_0");
            PLAIN_TEXT_12_0 = loader.tryGet("PLAIN_TEXT_12_0");
            PLAIN_TEXT_13_0 = loader.tryGet("PLAIN_TEXT_13_0");
            PLAIN_TEXT_14_0 = loader.tryGet("PLAIN_TEXT_14_0");
            PLAIN_TEXT_15_0 = loader.tryGet("PLAIN_TEXT_15_0");
            PLAIN_TEXT_16_0 = loader.tryGet("PLAIN_TEXT_16_0");
            PLAIN_TEXT_17_0 = loader.tryGet("PLAIN_TEXT_17_0");
            PLAIN_TEXT_18_0 = loader.tryGet("PLAIN_TEXT_18_0");
            PLAIN_TEXT_19_0 = loader.tryGet("PLAIN_TEXT_19_0");
            PLAIN_TEXT_20_0 = loader.tryGet("PLAIN_TEXT_20_0");
            PLAIN_TEXT_21_0 = loader.tryGet("PLAIN_TEXT_21_0");
            PLAIN_TEXT_22_0 = loader.tryGet("PLAIN_TEXT_22_0");
            PLAIN_TEXT_23_0 = loader.tryGet("PLAIN_TEXT_23_0");
            PLAIN_TEXT_24_0 = loader.tryGet("PLAIN_TEXT_24_0");
            PLAIN_TEXT_25_0 = loader.tryGet("PLAIN_TEXT_25_0");
            PLAIN_TEXT_26_0 = loader.tryGet("PLAIN_TEXT_26_0");
            PLAIN_TEXT_27_0 = loader.tryGet("PLAIN_TEXT_27_0");
        }

        // argument @ [4:2]
        protected final Forum forum;

        public Template(bot model) {
            super(model);
            __internal.setCharset("UTF-8");
            __internal.setContentType(CONTENT_TYPE);
            __internal.setTemplateName(TEMPLATE_NAME);
            __internal.setTemplatePackageName(TEMPLATE_PACKAGE_NAME);
            this.forum = model.forum();
        }

        @Override
        protected void __doRender() throws IOException, RenderingException {
            // ValueClosureBegin @ [6:1]
            __internal.aboutToExecutePosInTemplate(6, 1);
            __internal.renderValue(views.common.mainbot.template("Home").__body(() -> {
                // PlainText @ [6:44]
                __internal.aboutToExecutePosInTemplate(6, 44);
                __internal.writeValue(PLAIN_TEXT_0_0);
                // ValueExpression @ [9:13]
                __internal.aboutToExecutePosInTemplate(9, 13);
                __internal.renderValue(forum.title, false);
                // PlainText @ [9:25]
                __internal.aboutToExecutePosInTemplate(9, 25);
                __internal.writeValue(PLAIN_TEXT_1_0);
                // ValueExpression @ [10:13]
                __internal.aboutToExecutePosInTemplate(10, 13);
                __internal.renderValue(forum.subtitle, false);
                // PlainText @ [10:28]
                __internal.aboutToExecutePosInTemplate(10, 28);
                __internal.writeValue(PLAIN_TEXT_2_0);
                // ForBlockBegin @ [15:9]
                __internal.aboutToExecutePosInTemplate(15, 9);
                try {
                    final com.fizzed.rocker.runtime.CollectionForIterator<Post> __forIterator0 = new com.fizzed.rocker.runtime.CollectionForIterator<Post>(forum.posts);
                    while (__forIterator0.hasNext()) {
                        final Post p = __forIterator0.next();
                        try {
                            // PlainText @ [15:38]
                            __internal.aboutToExecutePosInTemplate(15, 38);
                            __internal.writeValue(PLAIN_TEXT_3_0);
                            // ValueExpression @ [17:27]
                            __internal.aboutToExecutePosInTemplate(17, 27);
                            __internal.renderValue(p.title, false);
                            // PlainText @ [17:35]
                            __internal.aboutToExecutePosInTemplate(17, 35);
                            __internal.writeValue(PLAIN_TEXT_4_0);
                            // ValueExpression @ [19:23]
                            __internal.aboutToExecutePosInTemplate(19, 23);
                            __internal.renderValue(p.body, false);
                            // PlainText @ [19:30]
                            __internal.aboutToExecutePosInTemplate(19, 30);
                            __internal.writeValue(PLAIN_TEXT_5_0);
                            // ValueExpression @ [21:27]
                            __internal.aboutToExecutePosInTemplate(21, 27);
                            __internal.renderValue(p.image_url, false);
                            // PlainText @ [21:39]
                            __internal.aboutToExecutePosInTemplate(21, 39);
                            __internal.writeValue(PLAIN_TEXT_6_0);
                            // ValueExpression @ [23:29]
                            __internal.aboutToExecutePosInTemplate(23, 29);
                            __internal.renderValue(p.created_at, false);
                            // PlainText @ [23:42]
                            __internal.aboutToExecutePosInTemplate(23, 42);
                            __internal.writeValue(PLAIN_TEXT_7_0);
                            // ValueExpression @ [27:30]
                            __internal.aboutToExecutePosInTemplate(27, 30);
                            __internal.renderValue(p.author.name, false);
                            // PlainText @ [27:44]
                            __internal.aboutToExecutePosInTemplate(27, 44);
                            __internal.writeValue(PLAIN_TEXT_8_0);
                            // ValueExpression @ [29:23]
                            __internal.aboutToExecutePosInTemplate(29, 23);
                            __internal.renderValue(p.author.role, false);
                            // PlainText @ [29:37]
                            __internal.aboutToExecutePosInTemplate(29, 37);
                            __internal.writeValue(PLAIN_TEXT_9_0);
                            // ValueExpression @ [31:24]
                            __internal.aboutToExecutePosInTemplate(31, 24);
                            __internal.renderValue(p.author.place, false);
                            // PlainText @ [31:39]
                            __internal.aboutToExecutePosInTemplate(31, 39);
                            __internal.writeValue(PLAIN_TEXT_5_0);
                            // ValueExpression @ [33:27]
                            __internal.aboutToExecutePosInTemplate(33, 27);
                            __internal.renderValue(p.author.avatar_url, false);
                            // PlainText @ [33:47]
                            __internal.aboutToExecutePosInTemplate(33, 47);
                            __internal.writeValue(PLAIN_TEXT_10_0);
                            // ForBlockEnd @ [15:9]
                            __internal.aboutToExecutePosInTemplate(15, 9);
                        } catch (com.fizzed.rocker.runtime.ContinueException e) {
                            // support for continuing for loops
                        }
                    } // for end @ [15:9]
                } catch (com.fizzed.rocker.runtime.BreakException e) {
                    // support for breaking for loops
                }
                // PlainText @ [35:10]
                __internal.aboutToExecutePosInTemplate(35, 10);
                __internal.writeValue(PLAIN_TEXT_11_0);
                // IfBlockBegin @ [38:5]
                __internal.aboutToExecutePosInTemplate(38, 5);
                if (forum.pageCount > 1) {
                    // PlainText @ [38:32]
                    __internal.aboutToExecutePosInTemplate(38, 32);
                    __internal.writeValue(PLAIN_TEXT_12_0);
                    // IfBlockBegin @ [40:9]
                    __internal.aboutToExecutePosInTemplate(40, 9);
                    if (forum.page > 1) {
                        // PlainText @ [40:31]
                        __internal.aboutToExecutePosInTemplate(40, 31);
                        __internal.writeValue(PLAIN_TEXT_13_0);
                        // ValueExpression @ [41:23]
                        __internal.aboutToExecutePosInTemplate(41, 23);
                        __internal.renderValue(forum.url, false);
                        // PlainText @ [41:33]
                        __internal.aboutToExecutePosInTemplate(41, 33);
                        __internal.writeValue(PLAIN_TEXT_14_0);
                        // IfBlockEnd @ [40:9]
                        __internal.aboutToExecutePosInTemplate(40, 9);
                    } // if end @ [40:9]
                    // PlainText @ [42:10]
                    __internal.aboutToExecutePosInTemplate(42, 10);
                    __internal.writeValue(PLAIN_TEXT_15_0);
                    // WithBlockBegin @ [44:9]
                    __internal.aboutToExecutePosInTemplate(44, 9);
                    com.fizzed.rocker.runtime.WithBlock.with(1, false, (i) -> {
                        // IfBlockBegin @ [45:13]
                        __internal.aboutToExecutePosInTemplate(45, 13);
                        if (forum.page > 5) {
                            // PlainText @ [45:35]
                            __internal.aboutToExecutePosInTemplate(45, 35);
                            __internal.writeValue(PLAIN_TEXT_16_0);
                            // IfBlockEnd @ [45:13]
                            __internal.aboutToExecutePosInTemplate(45, 13);
                        } // if end @ [45:13]
                        // IfBlockBegin @ [48:13]
                        __internal.aboutToExecutePosInTemplate(48, 13);
                        if (i != 1) {
                            // PlainText @ [48:27]
                            __internal.aboutToExecutePosInTemplate(48, 27);
                            __internal.writeValue(PLAIN_TEXT_17_0);
                            // IfBlockEnd @ [48:13]
                            __internal.aboutToExecutePosInTemplate(48, 13);
                        } // if end @ [48:13]
                        // ForBlockBegin @ [51:13]
                        __internal.aboutToExecutePosInTemplate(51, 13);
                        try {
                            for (Integer j = i; j<=forum.pageCount; j++) {
                                try {
                                    // IfBlockBegin @ [52:17]
                                    __internal.aboutToExecutePosInTemplate(52, 17);
                                    if (forum.page == j) {
                                        // PlainText @ [52:40]
                                        __internal.aboutToExecutePosInTemplate(52, 40);
                                        __internal.writeValue(PLAIN_TEXT_18_0);
                                        // ValueExpression @ [53:43]
                                        __internal.aboutToExecutePosInTemplate(53, 43);
                                        __internal.renderValue(j, false);
                                        // PlainText @ [53:45]
                                        __internal.aboutToExecutePosInTemplate(53, 45);
                                        __internal.writeValue(PLAIN_TEXT_19_0);
                                        // IfBlockElse @ [54:17]
                                        __internal.aboutToExecutePosInTemplate(54, 17);
                                    } else { // else @ [54:17]
                                        // PlainText @ [54:25]
                                        __internal.aboutToExecutePosInTemplate(54, 25);
                                        __internal.writeValue(PLAIN_TEXT_20_0);
                                        // ValueExpression @ [55:31]
                                        __internal.aboutToExecutePosInTemplate(55, 31);
                                        __internal.renderValue(forum.url, false);
                                        // PlainText @ [55:41]
                                        __internal.aboutToExecutePosInTemplate(55, 41);
                                        __internal.writeValue(PLAIN_TEXT_21_0);
                                        // ValueExpression @ [55:42]
                                        __internal.aboutToExecutePosInTemplate(55, 42);
                                        __internal.renderValue(j, false);
                                        // PlainText @ [55:44]
                                        __internal.aboutToExecutePosInTemplate(55, 44);
                                        __internal.writeValue(PLAIN_TEXT_22_0);
                                        // ValueExpression @ [55:47]
                                        __internal.aboutToExecutePosInTemplate(55, 47);
                                        __internal.renderValue(j, false);
                                        // PlainText @ [55:49]
                                        __internal.aboutToExecutePosInTemplate(55, 49);
                                        __internal.writeValue(PLAIN_TEXT_23_0);
                                        // IfBlockEnd @ [52:17]
                                        __internal.aboutToExecutePosInTemplate(52, 17);
                                    } // if end @ [52:17]
                                    // IfBlockBegin @ [57:17]
                                    __internal.aboutToExecutePosInTemplate(57, 17);
                                    if (j == (+forum.page + 4)) {
                                        // PlainText @ [57:47]
                                        __internal.aboutToExecutePosInTemplate(57, 47);
                                        __internal.writeValue(PLAIN_TEXT_24_0);
                                        // IfBlockEnd @ [57:17]
                                        __internal.aboutToExecutePosInTemplate(57, 17);
                                    } // if end @ [57:17]
                                    // ForBlockEnd @ [51:13]
                                    __internal.aboutToExecutePosInTemplate(51, 13);
                                } catch (com.fizzed.rocker.runtime.ContinueException e) {
                                    // support for continuing for loops
                                }
                            } // for end @ [51:13]
                        } catch (com.fizzed.rocker.runtime.BreakException e) {
                            // support for breaking for loops
                        }
                        // IfBlockBegin @ [62:13]
                        __internal.aboutToExecutePosInTemplate(62, 13);
                        if (forum.page != forum.pageCount) {
                            // PlainText @ [62:50]
                            __internal.aboutToExecutePosInTemplate(62, 50);
                            __internal.writeValue(PLAIN_TEXT_25_0);
                            // ValueExpression @ [63:27]
                            __internal.aboutToExecutePosInTemplate(63, 27);
                            __internal.renderValue(forum.url, false);
                            // PlainText @ [63:37]
                            __internal.aboutToExecutePosInTemplate(63, 37);
                            __internal.writeValue(PLAIN_TEXT_21_0);
                            // ValueExpression @ [63:38]
                            __internal.aboutToExecutePosInTemplate(63, 38);
                            __internal.renderValue(forum.pageCount, false);
                            // PlainText @ [63:54]
                            __internal.aboutToExecutePosInTemplate(63, 54);
                            __internal.writeValue(PLAIN_TEXT_26_0);
                            // IfBlockEnd @ [62:13]
                            __internal.aboutToExecutePosInTemplate(62, 13);
                        } // if end @ [62:13]
                        // WithBlockEnd @ [44:9]
                        __internal.aboutToExecutePosInTemplate(44, 9);
                    }); // with end @ [44:9]
                    // PlainText @ [65:10]
                    __internal.aboutToExecutePosInTemplate(65, 10);
                    __internal.writeValue(PLAIN_TEXT_27_0);
                    // IfBlockEnd @ [38:5]
                    __internal.aboutToExecutePosInTemplate(38, 5);
                } // if end @ [38:5]
                // ValueClosureEnd @ [6:1]
                __internal.aboutToExecutePosInTemplate(6, 1);
            }), false); // value closure end @ [6:1]
            // PlainText @ [68:2]
            __internal.aboutToExecutePosInTemplate(68, 2);
            __internal.writeValue(PLAIN_TEXT_15_0);
        }
    }

    private static class PlainText {

        static private final String PLAIN_TEXT_0_0 = "    <div class=\"page-header\">\n        <h1>\n            ";
        static private final String PLAIN_TEXT_1_0 = "<br>\n            ";
        static private final String PLAIN_TEXT_2_0 = "<br>\n            Posts\n        </h1>\n    </div>\n    <ul class=\"list-group\">\n";
        static private final String PLAIN_TEXT_3_0 = "            <li class=\"list-group-item\">\n                Title: <b>";
        static private final String PLAIN_TEXT_4_0 = "</b>\n                <br>\n                Body: ";
        static private final String PLAIN_TEXT_5_0 = "\n                <br>\n                <img src=\"";
        static private final String PLAIN_TEXT_6_0 = "\" class=\"thumbnail\" style=\"width: 140px; height: 140px;\">\n                <br>\n                Created At: ";
        static private final String PLAIN_TEXT_7_0 = "\n\n                <br>\n                <br>\n                Author Name: ";
        static private final String PLAIN_TEXT_8_0 = "\n                <br>\n                Role: ";
        static private final String PLAIN_TEXT_9_0 = "\n                <br>\n                Place: ";
        static private final String PLAIN_TEXT_10_0 = "\" class=\"img-circle\" style=\"width: 140px; height: 140px;\">\n            </li>\n";
        static private final String PLAIN_TEXT_11_0 = "    </ul>\n\n";
        static private final String PLAIN_TEXT_12_0 = "    <ul class=\"pagination\">\n";
        static private final String PLAIN_TEXT_13_0 = "        <li><a href=\"/";
        static private final String PLAIN_TEXT_14_0 = "/1\">&laquo;</a></li>\n";
        static private final String PLAIN_TEXT_15_0 = "\n";
        static private final String PLAIN_TEXT_16_0 = "                i = +forum.page - 4\n";
        static private final String PLAIN_TEXT_17_0 = "            <li class=\"disabled\"><a href=\"#\">...</a></li>\n";
        static private final String PLAIN_TEXT_18_0 = "                <li class=\"active\"><span> ";
        static private final String PLAIN_TEXT_19_0 = " <span class=\"sr-only\">(current)</span></span></li>\n";
        static private final String PLAIN_TEXT_20_0 = "                <li><a href=\"/";
        static private final String PLAIN_TEXT_21_0 = "/";
        static private final String PLAIN_TEXT_22_0 = "\"> ";
        static private final String PLAIN_TEXT_23_0 = " </a></li>\n";
        static private final String PLAIN_TEXT_24_0 = "                <li class=\"disabled\"><a href=\"#\">...</a></li>\n                break;\n";
        static private final String PLAIN_TEXT_25_0 = "            <li><a href=\"/";
        static private final String PLAIN_TEXT_26_0 = " \">&raquo;</a></li>\n";
        static private final String PLAIN_TEXT_27_0 = "    </ul>\n";

    }

}