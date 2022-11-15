# FAQ Session Software Development

## Questions

### Schleifen, Arrays? What's going on???

#### Wichtige Schleifen:
 
- Klassische `for`-Schleife zum Zählen
  - `for (int i = 0; i < 10; i++)`
- `for`-each-Schleife zum Durchlaufen von Arrays oder Collections
  - `for (String element : names)`
- `while`-Schleife
  - `while (dog.isBarking())`

#### Wann verwende ich welche Schleife?

Daumen-mal-Pi:
- Klassische `for`-Schleife: wenn man etwas zählen muss
- `for`-each: wenn ich alle Elemente eines Arrays / einer Collection betrachten muss
- `while`-Schleife: wenn ich im normalen Leben "solange ..." sagen würde

Grundsätzlich: die, wo ihr euch am wohlsten fühlt. Es ist aber wichtig, dass
ihr alle Varianten kennt und beherrscht. Ihr tendiert dann automatisch zur am
besten lesbaren Variante.

### Klassen und Objekte

#### Was ist der Unterschied?

- Eine Klasse ist eine "Produktbezeichnung" (Apfel, Pringels, ...).
- Ein Objekt ist ein Exemplar des Produktes (ein konkreter Apfel, in den man reinbeißen kann, eine Dose Pringels, ...).
- Die Klasse gibt es nur ein einziges mal.
- Objekte gibt es beliebig oft. Von gar nicht (leeres Regal) bis sehr viele.

#### Was ist ein Konstruktor?

- Erzeugt und initialisiert ein Objekt
- Wird ein einziges mal, naemlich beim Anlegen eines Objektes mit `new`, aufgerufen

#### Was sind Access-Specifier (public & private)?

- `public`: von außen sichtbar (kann von anderen Klassen verwendet werden)
- `private`: nur innerhalb der Klasse sichtbar
