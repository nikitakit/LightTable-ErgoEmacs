(defproject lt-ergoemacs-dv "0.0.1"
  :description "ErgoEmacs Dvorak keybindings for Light Table"
  :plugins [[lein-cljsbuild "1.0.0-alpha2"]]
  :cljsbuild {
  :builds [
  {
    :source-paths ["src"]
    :compiler {:output-to "_compiled.js"}
  }
  ]
  }
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2014"]
		])
