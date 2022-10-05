package custom.pokemon;

import ru.ifmo.se.pokemon.*;

public class Attacks {
    static class Facade extends PhysicalMove {
        public Facade() {
            super(Type.NORMAL, 70, 100);
        }

        private boolean isAttDoubled(Pokemon def) {
            Status status = def.getCondition();
            return status == Status.BURN || status == Status.PARALYZE || status == Status.POISON;
        }

        @Override
        protected void applyOppDamage(Pokemon def, double damage) {
            def.setMod(Stat.HP, (int) Math.round(this.isAttDoubled(def) ? damage * 2 : damage));
        }

        @Override
        protected String describe() {
            return "использует Facade";
        }
    }


    static class RockTomb extends PhysicalMove {
        public RockTomb() {
            super(Type.ROCK, 60, 95);
        }

        @Override
        protected void applyOppEffects(Pokemon p) {
            p.setMod(Stat.SPEED, -1);
        }

        @Override
        protected String describe() {
            return "использует RockTomb";
        }
    }


    static class RockSlide extends PhysicalMove {
        public RockSlide() {
            super(Type.ROCK, 75, 90);
        }

        @Override
        protected void applyOppEffects(Pokemon p) {
            Effect effect = new Effect().chance(0.3);
            effect.flinch(p);
        }

        @Override
        protected String describe() {
            return "использует Rock Slide";
        }
    }


    static class DoubleTeam extends StatusMove {
        public DoubleTeam() {
            super(Type.NORMAL, 0, 0);
        }

        @Override
        protected void applySelfEffects(Pokemon p) {
            p.setMod(Stat.EVASION, 1);
        }

        @Override
        protected String describe() {
            return "использует Double Team";
        }
    }


    static class DreamEater extends SpecialMove {
        public DreamEater() {
            super(Type.PSYCHIC, 100, 100);
        }

        @Override
        protected boolean checkAccuracy(Pokemon att, Pokemon def) {
            if (def.getCondition() == Status.SLEEP) {
                return (accuracy * att.getStat(Stat.ACCURACY) / def.getStat(Stat.EVASION)) > Math.random();
            }
            return false;
        }

        @Override
        protected void applySelfDamage(Pokemon att, double damage) {
            att.setMod(Stat.HP, (int) Math.round(-damage * 0.5));
        }

        @Override
        protected String describe() {
            return "использует Dream Eater";
        }
    }

    // NOTE: Я не понимаю как эта программа должна понимать, что этот прием для 
    // использования на союзных покемонах
    // NOTE: И как вообще прием может быть использован на союзных покемонов, если
    // они все атакуют пока не упадут в обморок по очереди?
    static class HealPulse extends StatusMove {
        public HealPulse() {
            super(Type.PSYCHIC, 0, 0);
        }

        @Override
        protected void applyOppEffects(Pokemon p) {
            p.setMod(Stat.HP,  (int)Math.round(-0.5 * p.getStat(Stat.HP)));
        }

        @Override
        protected String describe() {
            return "использует Heal Pulse";
        }
    }


    static class Charm extends StatusMove {
        public Charm() {
            super(Type.FAIRY, 0, 100);
        }

        @Override
        protected void applyOppEffects(Pokemon p) {
            p.setMod(Stat.ATTACK, -2);
        }

        @Override
        public String describe() {
            return "использует Charm";
        }
    }


    static class StoneEdge extends PhysicalMove {
        public StoneEdge() {
            super(Type.ROCK, 100, 80);
        }

        @Override
        protected double calcCriticalHit(Pokemon att, Pokemon def) {
            return Math.random() <= 1/8 ? 2 : 1;
        }

        @Override
        protected String describe() {
            return "использует Stone Edge";
        }
    }
    

    static class Crunch extends PhysicalMove {
        public Crunch() {
            super(Type.DARK, 80, 100);
        }

        @Override
        protected void applyOppEffects(Pokemon p) {
            Effect effect = new Effect().chance(.2).stat(Stat.DEFENSE, -1);
            p.addEffect(effect);
        }

        @Override
        protected String describe() {
            return "использует Crunch";
        }
    }
    

    static class SandAttack extends StatusMove {
        public SandAttack() {
            super(Type.GROUND, 0, 100);
        }

        @Override
        protected void applyOppEffects(Pokemon p) {
            p.setMod(Stat.ACCURACY, -1);
        }

        @Override
        protected String describe() {
            return "использует Sand Attack";
        }
    }
    

    static class TakeDown extends PhysicalMove {
        public TakeDown() {
            super(Type.NORMAL, 90, 85);
        }

        @Override
        protected void applySelfDamage(Pokemon att, double damage) {
            att.setMod(Stat.HP, (int)Math.round(damage * 0.25));
        }

        @Override
        protected String describe() {
            return "использует Take Down";
        }
    }
}