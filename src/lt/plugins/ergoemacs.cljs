(ns lt.plugins.ergoemacs
  (:require [lt.object :as object]
            [lt.objs.editor :as editor]
            [lt.objs.editor.pool :as pool]
            [lt.objs.command :as cmd]
            [lt.util.cljs :refer [str-contains?]]))

(cmd/command {:command :ergoemacs.test
              :desc "ErgoEmacs: test"
              :exec (fn []
                      (do) ;; I can't find documentations about commands that I can actually run here
                      )})

