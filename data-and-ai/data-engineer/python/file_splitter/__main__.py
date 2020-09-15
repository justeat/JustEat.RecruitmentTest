import argparse


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument('--input-file', type=str, required=True)
    parser.add_argument('--output-dir', type=str, required=True)
    parser.add_argument('--max-bytes', type=int, required=True)
    parser.add_argument('--max-lines', type=int, required=True)

    args = parser.parse_args()

    print(args.input_file)
    print(args.output_dir)
    print(args.max_bytes)
    print(args.max_lines)


if __name__ == '__main__':
    main()

