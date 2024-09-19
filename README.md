# Design pattern learning journey

## Principe de conception:

- Encapsulez ce qui varie
- Programmer une interface, non une implémentation.
- Préférez la composition à l'héritage.
- Efforcez-vous de coupler faiblement les objets qui interagissent
- Les classes doivent être ouvertes à l'extension, mais fermées à la modification.

## Définition:

**Le pattern STRATEGIE** définit une famille d’algorithmes, encapsule chacun d’eux et les rend interchangeables. Stratégie permet à l’algorithme de varier indépendamment des clients qui l’utilisent.

**Le pattern OBSERVATEUR** définit une relation entre objets de type un-à-plusieurs, de façon que lorsque un objet change d'état, tous ceux qui en dépendent en soient notifiés et soient mis à jour automatiquement.

**Le pattern DÉCORATEUR** attache dynamiquement des responsabilités supplémentaires à un objet. Il fournit une alternative souple à la dérivation, pour étendre les fonctionnalités.