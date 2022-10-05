# Задание


1. Ознакомиться с документацией, обращая особое внимание на классы Pokemon и Move. При дальнейшем выполнении лабораторной работы читать документацию еще несколько раз.

2. Скачать файл Pokemon.jar. Его необходимо будет использовать как для компиляции, так и для запуска программы. Распаковывать его не надо! Нужно научиться подключать внешние jar-файлы к своей программе.

3. Написать минимально работающую программу и посмотреть как она работает.
```java
Battle b = new Battle();
Pokemon p1 = new Pokemon("Чужой", 1);
Pokemon p2 = new Pokemon("Хищник", 1);
b.addAlly(p1);
b.addFoe(p2);
b.go();
```

4. Создать один из классов покемонов для своего варианта. Класс должен наследоваться от базового класса Pokemon. В конструкторе нужно будет задать типы покемона и его базовые характеристики. После этого попробуйте добавить покемона в сражение.
    
5. Создать один из классов атак для своего варианта (лучше всего начать с физической или специальной атаки). Класс должен наследоваться от класса PhysicalMove или SpecialMove. В конструкторе нужно будет задать тип атаки, ее силу и точность. После этого добавить атаку покемону и проверить ее действие в сражении. Не забудьте переопределить метод describe, чтобы выводилось нужное сообщение.
    
6. Если действие атаки отличается от стандартного, например, покемон не промахивается, либо атакующий покемон также получает повреждение, то в классе атаки нужно дополнительно переопределить соответствующие методы (см. документацию). При реализации атак, которые меняют статус покемона (наследники StatusMove), скорее всего придется разобраться с классом Effect. Он позволяет на один или несколько ходов изменить состояние покемона или модификатор его базовых характеристик.

7. Доделать все необходимые атаки и всех покемонов, распределить покемонов по командам, запустить сражение.

## Описание покемонов

### `Sawk`

**Type:** Fighting

**Base Stats**

| **Stat** | **Value** |
|-|-|
| `HP` | 75 |
| `Attack` | 125 |
| `Defense` | 75 |
| `Sp. Atk` | 30 |
| `Sp. Def` | 75 |
| `Speed` | 85 |

#### **Moves**

- `Facade` <br>
Category: **Physical** <br/>
Type: Normal <br/> <br/>
*Power:* 70 <br/> 
*Accuracy:* 100 <br/> <br/>
**Description:** <br/>
Facade deals damage, and hits with double power (140) if the user is burned, poisoned or paralyzed. <br/> In the case of a burn, the usual attack-halving still occurs so Facade hits with an effective power of 70.

- `Rock Tomb` <br/>
Category: **Physical** <br/>
Type: Rock <br/> <br/>
*Power:* 60 <br/> 
*Accuracy:* 95 <br/> <br/>
**Description:** <br/>
Rock Tomb deals damage and lowers the target's Speed by one stage.<br/> Stats can be lowered to a minimum of -6 stages each.

- `Rock Slide` <br/>
Category: **Physical** <br/>
Type: Rock <br/> <br/>
*Power:* 75 <br/> 
*Accuracy:* 90 <br/> <br/>
**Description:** <br/>
Rock Slide deals damage and has a 30% chance of causing the target to flinch (if the target has not yet moved). <br/> Pokémon with the ability Inner Focus or those behind a Substitute cannot be made to flinch.

- `Double Team` <br/>
Category: **Stats** <br/>
Type: Normal <br/> <br/>
*Power:* - <br/> 
*Accuracy:* - <br/> <br/>
**Description:** <br/>
Double Team raises the user's Evasiveness by one stage, thus making the user more difficult to hit. <br/> Stats can be raised to a maximum of +6 stages each.


### `Hippopotas`

**Type:** Ground

**Base Stats**

| **Stat** | **Value** |
|-|-|
| `HP` | 68 |
| `Attack` | 72 |
| `Defense` | 78 |
| `Sp. Atk` | 38 |
| `Sp. Def` | 42 |
| `Speed` | 32 |

#### **Moves**

- `Crunch` <br>
Category: **Physical** <br/>
Type: Dark <br/> <br/>
*Power:* 80 <br/> 
*Accuracy:* 100 <br/> <br/>
**Description:** <br/>
Crunch deals damage and has a 20% chance of lowering the target's Defense by one stage. <br/> Stats can be lowered to a minimum of -6 stages each.

- `Sand Attack` <br>
Category: **Status** <br/>
Type: Ground <br/> <br/>
*Power:* - <br/> 
*Accuracy:* 100 <br/> <br/>
**Description:** <br/>
Sand Attack lowers the target's Accuracy by one stage. Although it is a Ground-type move it still affects "raised" Pokémon. Raised Pokémon are any Flying types or those under the effects of Levitate, Magnet Rise or Telekinesis. Full details in glossary. <br/> Stats can be lowered to a minimum of -6 stages each. Pokémon with the abilities Keen Eye, Clear Body or White Smoke cannot have their accuracy reduced.

- `Take Down` <br>
Category: **Physical** <br/>
Type: Normal <br/> <br/>
*Power:* 90 <br/> 
*Accuracy:* 85 <br/> <br/>
**Description:** <br/>
Take Down deals damage, but the user receives 1⁄4 of the damage it inflicted in recoil. In other words, if the attack does 100 HP damage to the opponent, the user will lose 25 HP.

### `Hippowdon` *Hippopotas evolution*

**Type:** Ground

**Base Stats**

| **Stat** | **Value** |
|-|-|
| `HP` | 108 |
| `Attack` | 112 |
| `Defense` | 118 |
| `Sp. Atk` | 68 |
| `Sp. Def` | 72 |
| `Speed` | 47 |

#### **Moves**

- All `Hippopotas` moves +

- `Stone Edge` <br>
Category: **Physical** <br/>
Type: Rock <br/> <br/>
*Power:* 100 <br/> 
*Accuracy:* 80 <br/> <br/>
**Description:** <br/>
Stone Edge deals damage and has an increased critical hit ratio (1⁄8 instead of 1⁄24).



### `Ralts`

**Type:** Psychic, Fairy

**Base Stats**

| **Stat** | **Value** |
|-|-|
| `HP` | 28 |
| `Attack` | 25 |
| `Defense` | 25 |
| `Sp. Atk` | 45 |
| `Sp. Def` | 35 |
| `Speed` | 40 |

#### **Moves**

- `Dream Eater` <br>
Category: **Special** <br/>
Type: Psychic <br/> <br/>
*Power:* 100 <br/> 
*Accuracy:* 100 <br/> <br/>
**Description:** <br/>
Dream Eater deals damage only on sleeping foes and the user will recover 50% of the HP drained. <br/> If the user is holding a Big Root, the move instead recovers 65% of the damage dealt (30% more than normal). If used on a Pokémon with the ability Liquid Ooze, the user instead loses the HP it would have otherwise gained.

- `Heal Pulse` <br>
Category: **Status** <br/>
Type: Psychic <br/> <br/>
*Power:* - <br/> 
*Accuracy:* - <br/> <br/>
**Description:** <br/>
Heal Pulse restores half of the target's maximum HP. It can be used on team-mates but not on itself.


### `Kirlia` *Ralts evolution*

**Type:** Psychic, Fairy

**Base Stats**

| **Stat** | **Value** |
|-|-|
| `HP` | 38 |
| `Attack` | 35 |
| `Defense` | 35 |
| `Sp. Atk` | 65 |
| `Sp. Def` | 55 |
| `Speed` | 50 |

#### **Moves**

- All `Ralts` moves +

- `Charm` <br>
Category: **Status** <br/>
Type: Fairy <br/> <br/>
*Power:* - <br/> 
*Accuracy:* 100 <br/> <br/>
**Description:** <br/>
Charm lowers the target's Attack by two stages. <br/> Stats can be lowered to a minimum of -6 stages each.

### `Gardevoir` *Kirlia evolution*

**Type:** Psychic, Fairy

**Base Stats**

| **Stat** | **Value** |
|-|-|
| `HP` | 68 |
| `Attack` | 65 |
| `Defense` | 65 |
| `Sp. Atk` | 125 |
| `Sp. Def` | 115 |
| `Speed` | 80 |

#### **Moves**

- All `Kirlia` moves +

- `Facade` <br>
Category: **Physical** <br/>
Type: Normal <br/> <br/>
*Power:* 70 <br/> 
*Accuracy:* 100 <br/> <br/>
**Description:** <br/>
Facade deals damage, and hits with double power (140) if the user is burned, poisoned or paralyzed. <br/> In the case of a burn, the usual attack-halving still occurs so Facade hits with an effective power of 70.


# Код программы
[Вот ссылка на github](https://github.com/B0nBun/ProgrammingLab2), так как программа довольно большая разбита на несколько файлов


# Результат программы

```
Sawk Sawk from the team Black enters the battle!
Hippowdon Hippowdon from the team Striped enters the battle!
Sawk Sawk misses

Hippowdon Hippowdon использует Take Down. 
Sawk Sawk loses 4 hit points.
Hippowdon Hippowdon loses 1 hit points.

Sawk Sawk использует Rock Slide. 
Hippowdon Hippowdon loses 2 hit points.

Hippowdon Hippowdon использует Stone Edge. 
Sawk Sawk loses 2 hit points.

Sawk Sawk использует Facade. 
Hippowdon Hippowdon loses 5 hit points.

Hippowdon Hippowdon использует Sand Attack. 
Sawk Sawk decreases accuracy.

Sawk Sawk misses

Hippowdon Hippowdon использует Take Down. 
Sawk Sawk loses 6 hit points.
Hippowdon Hippowdon loses 2 hit points.

Sawk Sawk misses

Hippowdon Hippowdon использует Stone Edge. 
Sawk Sawk loses 2 hit points.
Sawk Sawk faints.
Hippopotas Hippopotas from the team Black enters the battle!
Hippowdon Hippowdon использует Stone Edge. 
Hippopotas Hippopotas loses 3 hit points.

Hippopotas Hippopotas использует Sand Attack. 
Hippowdon Hippowdon decreases accuracy.

Hippowdon Hippowdon использует Stone Edge. 
Hippopotas Hippopotas loses 3 hit points.

Hippopotas Hippopotas использует Take Down. 
Hippowdon Hippowdon loses 5 hit points.
Hippopotas Hippopotas loses 1 hit points.
Hippowdon Hippowdon faints.
Gardevoir Gardevoir from the team Striped enters the battle!
Gardevoir Gardevoir misses

Hippopotas Hippopotas использует Sand Attack. 
Gardevoir Gardevoir decreases accuracy.

Gardevoir Gardevoir использует Facade. 
Hippopotas Hippopotas loses 5 hit points.

Hippopotas Hippopotas использует Take Down. 
Gardevoir Gardevoir loses 7 hit points.
Hippopotas Hippopotas loses 2 hit points.
Hippopotas Hippopotas faints.
Kirlia Kirlia from the team Black enters the battle!
Gardevoir Gardevoir использует Facade. 
Kirlia Kirlia loses 4 hit points.

Kirlia Kirlia misses

Gardevoir Gardevoir использует Facade. 
Kirlia Kirlia loses 6 hit points.

Kirlia Kirlia misses

Gardevoir Gardevoir использует Charm. 
Kirlia Kirlia decreases attack.

Kirlia Kirlia использует Charm. 
Gardevoir Gardevoir decreases attack.

Gardevoir Gardevoir misses

Kirlia Kirlia использует Charm. 
Gardevoir Gardevoir decreases attack.

Gardevoir Gardevoir использует Charm. 
Kirlia Kirlia decreases attack.

Kirlia Kirlia misses

Gardevoir Gardevoir использует Charm. 
Kirlia Kirlia decreases attack.

Kirlia Kirlia misses

Gardevoir Gardevoir использует Facade. 
Kirlia Kirlia loses 3 hit points.
Kirlia Kirlia faints.
Team Black loses its last Pokemon.
The team Striped wins the battle!
```

# Вывод
Во время выполнения лабораторной работы я изучил основные концепции парадигмы **"Объектно Ориентированого Программирования"**, узнал и опробовал некоторые новые возможности `Java`, такие как ключевое слово `final`, наследование, модификаторы доступа, переопределение членов класса. А также ознакомулся с системой пакетов и импортов.