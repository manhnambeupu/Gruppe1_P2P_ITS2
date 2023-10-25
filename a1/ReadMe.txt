#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
# This text is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse   |
# Character encoding related QUICK-TEST-LINE: [Ä]=(Ae),[Ö]=(Oe),[Ü]=(Ue),[ä]=(ae),[ö]=(oe),[ü]=ue,[ß]=(szet)            |
#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|<-121
###--------------------\\\vvv///--------------------
### CHECK-IN TOGGLE --->>> X <<<--- CHECK-IN TOGGLE
###--------------------///^^^\\\--------------------
################################################################################
###
###     P2  Aufgabenzettel 1 -> A1 : Poker/Texas Hold’em Template
###     ==================================
###



"Zentrales Repository":
=======================
PRIVATE!
VCS: git@git.HAW-Hamburg.de:shf/Px/LabExercise/XOX_Poker_Distr[.git]





Informationen zum Template für die Pokeraufgabe
===============================================


Klasse(n)&Packages:                 Aufgabe/Sinn/Zweck:


application/DummyForYourSolution    Eine "Wrapper-Klasse" die die "gewachsene Lösung" adaptiert und das eingeforderte Interface
                                    (test.)GameAnalyzer unterstüzt. Dies ist nötig, damit der TestFrame die Lösung akzeptiert.

test/TestFrameAndStarter            Die TestSuite. Sie testet mit "Zufalls-Unterstützung". Die Reihenfolge der einzelnen Tests
                                    sowie deren Detail-Auspraegung variieren mit jedem Durchlauf. Beim ersten Fehler wird der Test
                                    abgebrochen. Wegen den "Zufalls-Effekten" ist eine Reproduzierbarkeit des Tests NICHT gegeben.


application/cards/...               Enthhält die aus P1 bekannten Karten.

application/implementation/...      "Hier" wäre ein guter Ort für ihre Implementierung.
                                    Sie können aber auch direkt in "application/..."arbeiten,  da sich "dort"DummyForYourSolution
                                    befindet. Dies ist Ihre Entscheidung.


supportStuff/applicationSupport/... Gegenwärtig leer. Kann für "allgemeine" (Hilfs-)Klassen, die ihre Implementierung unterstützen
                                    genutzt werden.

supportStuff/testSupport/...        (Hilfs-)Klassen, die nicht verstanden werden müssen/sollen. (Security by obscurity ;-)
                                    Ihre Existenz ist jedoch zwingend erforderlich.
                                    Die in testSupport enthaltenen Dinge dürfen WEDER direkt NOCH indirekt modifiziert werden.

supportStuff/utility/...            (Hilfs-)Klassen, die nicht verstanden werden müssen.
                                    Ihre Existenz ist jedoch zwingend erforderlich.
                                    Die in utility enthaltenen Dinge dürfen WEDER direkt NOCH indirekt modifiziert werden.


version/...                         Enthält die GivenCodeVersion. Diese Klasse darf WEDER direkt NOCH indirekt modifiziert werden.





Ausgabe:
========

Im Fehlerfall:

Internal Code: <NR>     NR  =  Current Test-ID
                        Hilft im "kritischen" Fall den konkreten Test zu identifizieren.
                        Wegen der "Zufalls-Unterstützung" ist es dem Test selbst nicht anzusehen.


Im Erfolgsfall:

Internal Code: <...>    [Current Test-ID];[time]/[ExecutedTestCouNT]->[time/ExecutedTestCouNT}
                        ID des letzten Tests; Zeitbedarf in ns / Anzahl der durchgeführten Tests -> durchschnittliche Zeit pro Test
